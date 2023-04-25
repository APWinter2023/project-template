module supermario {
    requires java.desktop;
    requires weld.core.impl;
    requires jakarta.cdi;

    requires java.logging;
    requires jakarta.el;

    requires org.jboss.logging;
    requires org.junit.jupiter.api;
    requires jakarta.persistence;
    requires jakarta.activation;
//    requires org.apache.logging.log4j;
//    requires org.apache.logging.log4j.core;
    opens ir.sharif.math.supermario.ui;
    opens ir.sharif.math.supermario.model;
//    requires ch.qos.logback.core;
    requires org.slf4j;
    requires java.naming;

    exports ir.sharif.math.supermario;
}