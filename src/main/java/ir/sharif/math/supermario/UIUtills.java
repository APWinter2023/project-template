package ir.sharif.math.supermario;

import ir.sharif.math.supermario.model.Mario;
import ir.sharif.math.supermario.ui.MyFrame;
import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;
import jakarta.persistence.Persistence;

import java.io.Closeable;
import java.io.IOException;

public class UIUtills implements Closeable {

    public static UIUtills instance = new UIUtills();
    private SeContainer applicationContext;

    UIUtills() {
        this.createContext();
    }

    public static <T> T getBean(final Class<T> c) {
        return UIUtills.instance.getContext().select(c).get();
    }

    public static UIUtills getInstance() {
        return UIUtills.instance;
    }

    @Override
    public void close() throws IOException {
//        this.applicationContext.select(EntityManagerProvider.class).get().closeFactory();
        this.applicationContext.close();
        System.out.println("application context closed by me");
    }

    private SeContainer createContext() {

        final SeContainerInitializer initializer = SeContainerInitializer.newInstance();
        this.applicationContext = initializer.disableDiscovery().addPackages(true, Mario.class).initialize();
//		this.applicationContext = initializer.initialize();
//        final var emf = Persistence.createEntityManagerFactory("workflowplanner-pu");
//        this.applicationContext.select(EntityManagerProvider.class).get().setEntityManagerFactory(emf);
        return this.applicationContext;
    }

    public SeContainer getContext() {
        return this.applicationContext;

    }

    public void printAllBeans() {
        final var con = this.getContext();
        /*
         * Arrays.stream(con.getBeanDefinitionNames()).forEach(x -> { Object
         * clazz = null; try { clazz = con.getBean(x); } catch (final Exception
         * e) { // TODO Auto-generated catch block e.printStackTrace(); }
         * System.out.println(x + " " + clazz.getClass()); });
         */
    }

}
