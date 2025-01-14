package com.sun.ts.tests.ejb32.lite.timer.schedule.tx;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.container.test.api.OverProtocol;
import org.jboss.arquillian.container.test.api.TargetsContainer;
import org.jboss.arquillian.junit5.ArquillianExtension;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import tck.arquillian.porting.lib.spi.TestArchiveProcessor;
import tck.arquillian.protocol.common.TargetVehicle;

import java.net.URL;



@ExtendWith(ArquillianExtension.class)
@Tag("platform")
@Tag("ejb_web_profile")
@Tag("web")
@Tag("tck-javatest")

public class ClientEjbliteservlet2Test extends com.sun.ts.tests.ejb32.lite.timer.schedule.tx.Client {
    static final String VEHICLE_ARCHIVE = "ejb32_lite_timer_schedule_tx_ejbliteservlet2_vehicle";

        /**
        EE10 Deployment Descriptors:
        ejb32_lite_timer_schedule_tx_ejblitejsf_vehicle_web: WEB-INF/ejb-jar.xml,WEB-INF/beans.xml,WEB-INF/faces-config.xml,WEB-INF/web.xml
        ejb32_lite_timer_schedule_tx_ejblitejsp_vehicle_web: WEB-INF/ejb-jar.xml
        ejb32_lite_timer_schedule_tx_ejbliteservlet_vehicle_web: WEB-INF/ejb-jar.xml,WEB-INF/web.xml
        ejb32_lite_timer_schedule_tx_ejbliteservlet2_vehicle_web: WEB-INF/ejb-jar.xml,WEB-INF/web.xml
        ejb32_lite_timer_schedule_txnonpersistent_ejblitejsf_vehicle_web: WEB-INF/beans.xml,WEB-INF/faces-config.xml,WEB-INF/web.xml
        ejb32_lite_timer_schedule_txnonpersistent_ejblitejsp_vehicle_web: 
        ejb32_lite_timer_schedule_txnonpersistent_ejbliteservlet_vehicle_web: WEB-INF/web.xml
        ejb32_lite_timer_schedule_txnonpersistent_ejbliteservlet2_vehicle_web: WEB-INF/web.xml

        Found Descriptors:
        War:

        /com/sun/ts/tests/common/vehicle/ejbliteservlet2/ejbliteservlet2_vehicle_web.xml
        */
        @TargetsContainer("tck-javatest")
        @OverProtocol("javatest")
        @Deployment(name = VEHICLE_ARCHIVE, order = 2)
        public static WebArchive createDeploymentVehicle(@ArquillianResource TestArchiveProcessor archiveProcessor) {

        // War
            // the war with the correct archive name
            WebArchive ejb32_lite_timer_schedule_tx_ejbliteservlet2_vehicle_web = ShrinkWrap.create(WebArchive.class, "ejb32_lite_timer_schedule_tx_ejbliteservlet2_vehicle_web.war");
            // The class files
            ejb32_lite_timer_schedule_tx_ejbliteservlet2_vehicle_web.addClasses(
            com.sun.ts.lib.harness.EETest.Fault.class,
            com.sun.ts.tests.ejb30.timer.common.JsfClientBase.class,
            com.sun.ts.tests.ejb30.timer.common.TimerBeanBase.class,
            com.sun.ts.tests.common.vehicle.VehicleRunnable.class,
            com.sun.ts.tests.ejb32.lite.timer.schedule.tx.JsfClientBase.class,
            com.sun.ts.tests.ejb32.lite.timer.schedule.tx.ScheduleTxBeanBase.class,
            com.sun.ts.tests.ejb30.common.helper.Helper.class,
            com.sun.ts.tests.ejb30.common.lite.EJBLiteClientBase.class,
            com.sun.ts.tests.ejb32.lite.timer.schedule.tx.ScheduleBMTBean.class,
            com.sun.ts.tests.ejb30.timer.common.ClientBase.class,
            com.sun.ts.tests.ejb30.timer.common.TimerBeanBaseWithoutTimeOutMethod.class,
            com.sun.ts.lib.harness.EETest.class,
            com.sun.ts.lib.harness.ServiceEETest.class,
            com.sun.ts.tests.common.vehicle.VehicleClient.class,
            com.sun.ts.tests.ejb30.common.lite.NumberIF.class,
            com.sun.ts.tests.common.vehicle.ejbliteshare.EJBLiteClientIF.class,
            com.sun.ts.tests.common.vehicle.VehicleRunnerFactory.class,
            com.sun.ts.tests.ejb32.lite.timer.schedule.tx.Client.class,
            com.sun.ts.tests.ejb30.timer.common.TimerInfo.class,
            com.sun.ts.tests.ejb32.lite.timer.schedule.tx.ClientBase.class,
            com.sun.ts.tests.common.vehicle.ejbliteshare.ReasonableStatus.class,
            com.sun.ts.tests.ejb30.timer.common.TimeoutStatusBean.class,
            com.sun.ts.tests.ejb30.timer.common.ScheduleValues.class,
            com.sun.ts.tests.ejb32.lite.timer.schedule.tx.HttpServletDelegate.class,
            com.sun.ts.tests.ejb30.common.lite.NumberEnum.class,
            com.sun.ts.tests.ejb32.lite.timer.schedule.tx.ScheduleBean.class,
            com.sun.ts.tests.ejb32.lite.timer.schedule.tx.JsfClient.class,
            com.sun.ts.tests.ejb30.common.lite.EJBLiteJsfClientBase.class,
            com.sun.ts.tests.ejb32.lite.timer.schedule.tx.EJBLiteServlet2Filter.class,
            com.sun.ts.tests.ejb30.timer.common.ScheduleAttributeType.class,
            com.sun.ts.tests.ejb30.timer.common.TimerUtil.class,
            com.sun.ts.lib.harness.EETest.SetupException.class
            );
            // The web.xml descriptor
            URL warResURL = Client.class.getResource("ejbliteservlet2_vehicle_web.xml");
            if(warResURL != null) {
              ejb32_lite_timer_schedule_tx_ejbliteservlet2_vehicle_web.addAsWebInfResource(warResURL, "web.xml");
            }
            // The sun-web.xml descriptor
            warResURL = Client.class.getResource("/ejbliteservlet2_vehicle_web.war.sun-web.xml");
            if(warResURL != null) {
              ejb32_lite_timer_schedule_tx_ejbliteservlet2_vehicle_web.addAsWebInfResource(warResURL, "sun-web.xml");
            }
            // Web content
            warResURL = Client.class.getResource("/com/sun/ts/tests/common/vehicle/ejbliteservlet2/EJBLiteServlet2Filter.java.txt");
            if(warResURL != null) {
              ejb32_lite_timer_schedule_tx_ejbliteservlet2_vehicle_web.addAsWebResource(warResURL, "/EJBLiteServlet2Filter.java.txt");
            }
            warResURL = Client.class.getResource("/com/sun/ts/tests/ejb32/lite/timer/schedule/tx/ejb-jar.xml");
            if(warResURL != null) {
              ejb32_lite_timer_schedule_tx_ejbliteservlet2_vehicle_web.addAsWebResource(warResURL, "/WEB-INF/ejb-jar.xml");
            }
            warResURL = Client.class.getResource("/com/sun/ts/tests/common/vehicle/ejbliteservlet2/ejbliteservlet2_vehicle_web.xml");
            if(warResURL != null) {
              ejb32_lite_timer_schedule_tx_ejbliteservlet2_vehicle_web.addAsWebResource(warResURL, "/WEB-INF/ejbliteservlet2_vehicle_web.xml");
            }
            warResURL = Client.class.getResource("/com/sun/ts/tests/common/vehicle/ejbliteservlet2/ejbliteservlet2_vehicle.jsp");
            if(warResURL != null) {
              ejb32_lite_timer_schedule_tx_ejbliteservlet2_vehicle_web.addAsWebResource(warResURL, "/ejbliteservlet2_vehicle.jsp");
            }

           // Call the archive processor
           archiveProcessor.processWebArchive(ejb32_lite_timer_schedule_tx_ejbliteservlet2_vehicle_web, Client.class, warResURL);

        return ejb32_lite_timer_schedule_tx_ejbliteservlet2_vehicle_web;
        }

        @Test
        @Override
        @TargetVehicle("ejbliteservlet2")
        public void createRollback() {
            super.createRollback();
        }

        @Test
        @Override
        @TargetVehicle("ejbliteservlet2")
        public void createRollbackBMT() {
            super.createRollbackBMT();
        }

        @Test
        @Override
        @TargetVehicle("ejbliteservlet2")
        public void createRollbackTxPropagation() throws java.lang.Exception {
            super.createRollbackTxPropagation();
        }

        @Test
        @Override
        @TargetVehicle("ejbliteservlet2")
        public void createRollbackTxPropagationBMT() throws java.lang.Exception {
            super.createRollbackTxPropagationBMT();
        }

        @Test
        @Override
        @TargetVehicle("ejbliteservlet2")
        public void cancelRollback() {
            super.cancelRollback();
        }

        @Test
        @Override
        @TargetVehicle("ejbliteservlet2")
        public void cancelRollbackBMT() {
            super.cancelRollbackBMT();
        }

        @Test
        @Override
        @TargetVehicle("ejbliteservlet2")
        public void cancelRollbackPropagation() throws java.lang.Exception {
            super.cancelRollbackPropagation();
        }

        @Test
        @Override
        @TargetVehicle("ejbliteservlet2")
        public void cancelRollbackPropagationBMT() throws java.lang.Exception {
            super.cancelRollbackPropagationBMT();
        }

        @Test
        @Override
        @TargetVehicle("ejbliteservlet2")
        public void timeoutRollback() {
            super.timeoutRollback();
        }

        @Test
        @Override
        @TargetVehicle("ejbliteservlet2")
        public void timeoutSystemException() {
            super.timeoutSystemException();
        }

        @Test
        @Override
        @TargetVehicle("ejbliteservlet2")
        public void timeoutSystemExceptionBMT() {
            super.timeoutSystemExceptionBMT();
        }

        @Test
        @Override
        @TargetVehicle("ejbliteservlet2")
        public void createTimerWithoutTx() {
            super.createTimerWithoutTx();
        }

        @Test
        @Override
        @TargetVehicle("ejbliteservlet2")
        public void createTimerWithoutTxHavingClientTx() throws java.lang.Exception {
            super.createTimerWithoutTxHavingClientTx();
        }


}