package ir.sharif.math.supermario;

import ir.sharif.math.supermario.model.Game;
import ir.sharif.math.supermario.model.Mario;
import ir.sharif.math.supermario.ui.MyFrame;
import org.jboss.weld.bean.builtin.BeanManagerProxy;
import org.jboss.weld.manager.BeanManagerImpl;

import java.awt.*;
import java.util.Arrays;

public class ContainerInitilizer {
    public static void main(String[] args) {
        var con = UIUtills.getInstance().getContext();
//        var a = con.stream();
//        a.forEach(x -> {
//                    try {
//                        System.out.println(x.getClass());
//                    } catch (final Exception e) { // TODO Auto-generated catch block e.printStackTrace(); }
//                    }
//                }
//            );
//            var mario = UIUtills.getBean(Mario.class);
//            var game = UIUtills.getBean(Game.class);
            EventQueue.invokeLater(new Runnable() {
                public void run() {
//                    var myFrame = new MyFrame(UIUtills.getBean(Game.class));
                    var myFrame = new MyFrame();
                }
            });

            System.out.println("here2");
//            mario.print();

        }
    }

