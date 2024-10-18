package com.sun.ts.tests.jms.core.bytesMsgTopic;

import com.sun.ts.tests.jms.core.bytesMsgTopic.BytesMsgTopicTests;
import java.net.URL;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.container.test.api.OperateOnDeployment;
import org.jboss.arquillian.container.test.api.OverProtocol;
import org.jboss.arquillian.container.test.api.TargetsContainer;
import org.jboss.arquillian.junit5.ArquillianExtension;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.StringAsset;
import org.jboss.shrinkwrap.api.exporter.ZipExporter;
import org.jboss.shrinkwrap.api.spec.EnterpriseArchive;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import tck.arquillian.porting.lib.spi.TestArchiveProcessor;
import tck.arquillian.protocol.common.TargetVehicle;



@ExtendWith(ArquillianExtension.class)
@Tag("jms")
@Tag("platform")
@Tag("jms_web")
@Tag("web_optional")
@Tag("tck-javatest")

@TestMethodOrder(MethodOrderer.MethodName.class)
public class BytesMsgTopicTestsJspTest extends com.sun.ts.tests.jms.core.bytesMsgTopic.BytesMsgTopicTests {
    static final String VEHICLE_ARCHIVE = "bytesMsgTopic_jsp_vehicle";

        /**
        EE10 Deployment Descriptors:
        bytesMsgTopic_appclient_vehicle: 
        bytesMsgTopic_appclient_vehicle_client: jar.sun-application-client.xml,META-INF/application-client.xml
        bytesMsgTopic_ejb_vehicle: 
        bytesMsgTopic_ejb_vehicle_client: jar.sun-application-client.xml,META-INF/application-client.xml
        bytesMsgTopic_ejb_vehicle_ejb: META-INF/ejb-jar.xml,jar.sun-ejb-jar.xml
        bytesMsgTopic_jsp_vehicle: 
        bytesMsgTopic_jsp_vehicle_web: WEB-INF/web.xml,war.sun-web.xml
        bytesMsgTopic_servlet_vehicle: 
        bytesMsgTopic_servlet_vehicle_web: WEB-INF/web.xml,war.sun-web.xml

        Found Descriptors:
        War:

        /com/sun/ts/tests/jms/core/bytesMsgTopic/jsp_vehicle_web.xml
        /com/sun/ts/tests/common/vehicle/jsp/jsp_vehicle_web.xml
        Ear:

        */
        @TargetsContainer("tck-javatest")
        @OverProtocol("javatest")
        @Deployment(name = VEHICLE_ARCHIVE, order = 2)
        public static EnterpriseArchive createDeploymentVehicle(@ArquillianResource TestArchiveProcessor archiveProcessor) {
        // War
            // the war with the correct archive name
            WebArchive bytesMsgTopic_jsp_vehicle_web = ShrinkWrap.create(WebArchive.class, "bytesMsgTopic_jsp_vehicle_web.war");
            // The class files
            bytesMsgTopic_jsp_vehicle_web.addClasses(
            com.sun.ts.tests.jms.common.JmsTool.class,
            com.sun.ts.tests.common.vehicle.VehicleRunnable.class,
            com.sun.ts.tests.common.vehicle.VehicleRunnerFactory.class,
            com.sun.ts.lib.harness.EETest.Fault.class,
            com.sun.ts.tests.jms.core.bytesMsgTopic.BytesMsgTopicTests.class,
            com.sun.ts.lib.harness.EETest.class,
            com.sun.ts.lib.harness.ServiceEETest.class,
            com.sun.ts.lib.harness.EETest.SetupException.class,
            com.sun.ts.tests.common.vehicle.VehicleClient.class
            );
            // The web.xml descriptor
            URL warResURL = BytesMsgTopicTests.class.getResource("/com/sun/ts/tests/jms/core/bytesMsgTopic/jsp_vehicle_web.xml");
            if(warResURL != null) {
              bytesMsgTopic_jsp_vehicle_web.addAsWebInfResource(warResURL, "web.xml");
            }
            // The sun-web.xml descriptor
            warResURL = BytesMsgTopicTests.class.getResource("/com/sun/ts/tests/jms/core/bytesMsgTopic/bytesMsgTopic_jsp_vehicle_web.war.sun-web.xml");
            if(warResURL != null) {
              bytesMsgTopic_jsp_vehicle_web.addAsWebInfResource(warResURL, "sun-web.xml");
            }

            // Any libraries added to the war

            // // Web content
            // warResURL = BytesMsgTopicTests.class.getResource("/com/sun/ts/tests/common/vehicle/jsp/jsp_vehicle_web.xml");
            // if(warResURL != null) {
            //   bytesMsgTopic_jsp_vehicle_web.addAsWebResource(warResURL, "/WEB-INF/jsp_vehicle_web.xml");
            // }
            // warResURL = BytesMsgTopicTests.class.getResource("/com/sun/ts/tests/jms/core/bytesMsgTopic/jsp_vehicle_web.xml");
            // if(warResURL != null) {
            //   bytesMsgTopic_jsp_vehicle_web.addAsWebResource(warResURL, "/WEB-INF/jsp_vehicle_web.xml");
            // }
            warResURL = BytesMsgTopicTests.class.getResource("/com/sun/ts/tests/common/vehicle/jsp/contentRoot/client.html");
            if(warResURL != null) {
              bytesMsgTopic_jsp_vehicle_web.addAsWebResource(warResURL, "/client.html");
            }
            warResURL = BytesMsgTopicTests.class.getResource("/com/sun/ts/tests/common/vehicle/jsp/contentRoot/jsp_vehicle.jsp");
            if(warResURL != null) {
              bytesMsgTopic_jsp_vehicle_web.addAsWebResource(warResURL, "/jsp_vehicle.jsp");
            }

           // Call the archive processor
           archiveProcessor.processWebArchive(bytesMsgTopic_jsp_vehicle_web, BytesMsgTopicTests.class, warResURL);

        // Ear
            EnterpriseArchive bytesMsgTopic_jsp_vehicle_ear = ShrinkWrap.create(EnterpriseArchive.class, "bytesMsgTopic_jsp_vehicle.ear");

            // Any libraries added to the ear

            // The component jars built by the package target
            bytesMsgTopic_jsp_vehicle_ear.addAsModule(bytesMsgTopic_jsp_vehicle_web);



            // // The application.xml descriptor
            // URL earResURL = null;
            // // The sun-application.xml descriptor
            // earResURL = BytesMsgTopicTests.class.getResource("/.ear.sun-application.xml");
            // if(earResURL != null) {
            //   bytesMsgTopic_jsp_vehicle_ear.addAsManifestResource(earResURL, "sun-application.xml");
            // }
            // // Call the archive processor
            // archiveProcessor.processEarArchive(bytesMsgTopic_jsp_vehicle_ear, BytesMsgTopicTests.class, earResURL);
        return bytesMsgTopic_jsp_vehicle_ear;
        }

        @Test
        @Override
        @TargetVehicle("jsp")
        public void bytesMsgNullStreamTopicTest() throws java.lang.Exception {
            super.bytesMsgNullStreamTopicTest();
        }

        @Test
        @Override
        @TargetVehicle("jsp")
        public void bytesMessageTopicTestsFullMsg() throws java.lang.Exception {
            super.bytesMessageTopicTestsFullMsg();
        }

        @Test
        @Override
        @TargetVehicle("jsp")
        public void bytesMessageTNotWriteable() throws java.lang.Exception {
            super.bytesMessageTNotWriteable();
        }


}