package com.sun.ts.tests.connector.localTx.security;

import java.net.URL;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.container.test.api.OverProtocol;
import org.jboss.arquillian.container.test.api.TargetsContainer;
import org.jboss.arquillian.junit5.ArquillianExtension;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.StringAsset;
import org.jboss.shrinkwrap.api.exporter.ZipExporter;
import org.jboss.shrinkwrap.api.spec.EnterpriseArchive;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import tck.arquillian.porting.lib.spi.TestArchiveProcessor;
import tck.arquillian.protocol.common.TargetVehicle;



@ExtendWith(ArquillianExtension.class)
@Tag("connector")
@Tag("platform")
@Tag("connector_standalone")
@Tag("connector_web")
@Tag("web_optional")
@Tag("tck-appclient")

@TestMethodOrder(MethodOrderer.MethodName.class)
public class securityClient1EjbTest extends com.sun.ts.tests.connector.localTx.security.securityClient1 {
    static final String VEHICLE_ARCHIVE = "localTx_security_ejb_vehicle";

        /**
        EE10 Deployment Descriptors:
        localTx_security_ejb_vehicle: 
        localTx_security_ejb_vehicle_client: META-INF/application-client.xml,jar.sun-application-client.xml
        localTx_security_ejb_vehicle_ejb: META-INF/ejb-jar.xml,jar.sun-ejb-jar.xml
        localTx_security_jsp_vehicle: 
        localTx_security_jsp_vehicle_web: WEB-INF/web.xml,war.sun-web.xml
        localTx_security_servlet_vehicle: 
        localTx_security_servlet_vehicle_web: WEB-INF/web.xml,war.sun-web.xml

        Found Descriptors:
        Client:

        /com/sun/ts/tests/connector/localTx/security/localTx_security_ejb_vehicle_client.xml
        /com/sun/ts/tests/common/vehicle/ejb/ejb_vehicle_client.xml
        Ejb:

        /com/sun/ts/tests/connector/localTx/security/localTx_security_ejb_vehicle_ejb.xml
        /com/sun/ts/tests/connector/localTx/security/ejb_vehicle_ejb.xml
        /com/sun/ts/tests/common/vehicle/ejb/ejb_vehicle_ejb.jar.sun-ejb-jar.xml
        /com/sun/ts/tests/common/vehicle/ejb/ejb_vehicle_ejb.xml
        Rar:

        /com/sun/ts/tests/common/connector/whitebox/mdcomplete/ra-md-complete.xml
        Ear:

        */
        @TargetsContainer("tck-appclient")
        @OverProtocol("appclient")
        @Deployment(name = VEHICLE_ARCHIVE, order = 2)
        public static EnterpriseArchive createDeploymentVehicle(@ArquillianResource TestArchiveProcessor archiveProcessor) {
        // Client
            // the jar with the correct archive name
            JavaArchive localTx_security_ejb_vehicle_client = ShrinkWrap.create(JavaArchive.class, "localTx_security_ejb_vehicle_client.jar");
            // The class files
            localTx_security_ejb_vehicle_client.addClasses(
            com.sun.ts.tests.connector.localTx.security.securityClient1.class,		
            com.sun.ts.tests.common.vehicle.VehicleRunnable.class,
            com.sun.ts.tests.common.vehicle.VehicleRunnerFactory.class,
            com.sun.ts.tests.common.vehicle.ejb.EJBVehicleRemote.class,
            com.sun.ts.lib.harness.EETest.Fault.class,
            com.sun.ts.tests.common.vehicle.EmptyVehicleRunner.class,
            com.sun.ts.tests.common.vehicle.ejb.EJBVehicleRunner.class,
            com.sun.ts.tests.connector.util.DBSupport.class,
            com.sun.ts.lib.harness.EETest.class,
            com.sun.ts.lib.harness.ServiceEETest.class,
            com.sun.ts.lib.harness.EETest.SetupException.class,
            com.sun.ts.tests.common.vehicle.VehicleClient.class
            );
            // The application-client.xml descriptor
            URL resURL = securityClient1.class.getResource("localTx_security_ejb_vehicle_client.xml");
            if(resURL != null) {
              localTx_security_ejb_vehicle_client.addAsManifestResource(resURL, "application-client.xml");
            }
            // The sun-application-client.xml file need to be added or should this be in in the vendor Arquillian extension?
            resURL = securityClient1.class.getResource("localTx_security_ejb_vehicle_client.jar.sun-application-client.xml");
            if(resURL != null) {
              localTx_security_ejb_vehicle_client.addAsManifestResource(resURL, "sun-application-client.xml");
            }
            localTx_security_ejb_vehicle_client.addAsManifestResource(new StringAsset("Main-Class: com.sun.ts.tests.common.vehicle.VehicleClient\n"), "MANIFEST.MF");
            // Call the archive processor
            archiveProcessor.processClientArchive(localTx_security_ejb_vehicle_client, securityClient1.class, resURL);

        // Ejb 1
            // the jar with the correct archive name
            JavaArchive localTx_security_ejb_vehicle_ejb = ShrinkWrap.create(JavaArchive.class, "localTx_security_ejb_vehicle_ejb.jar");
            // The class files
            localTx_security_ejb_vehicle_ejb.addClasses(
                com.sun.ts.tests.connector.localTx.security.securityClient1.class,
                com.sun.ts.tests.common.vehicle.VehicleRunnable.class,
                com.sun.ts.tests.common.vehicle.VehicleRunnerFactory.class,
                com.sun.ts.tests.common.vehicle.ejb.EJBVehicleRemote.class,
                com.sun.ts.lib.harness.EETest.Fault.class,
                com.sun.ts.tests.connector.util.DBSupport.class,
                com.sun.ts.lib.harness.EETest.class,
                com.sun.ts.lib.harness.ServiceEETest.class,
                com.sun.ts.lib.harness.EETest.SetupException.class,
                com.sun.ts.tests.common.vehicle.VehicleClient.class,
                com.sun.ts.tests.common.vehicle.ejb.EJBVehicle.class
            );
            // The ejb-jar.xml descriptor
            URL ejbResURL1 = securityClient1.class.getResource("localTx_security_ejb_vehicle_ejb.xml");
            if(ejbResURL1 != null) {
              localTx_security_ejb_vehicle_ejb.addAsManifestResource(ejbResURL1, "ejb-jar.xml");
            }
            // The sun-ejb-jar.xml file
            ejbResURL1 = securityClient1.class.getResource("localTx_security_ejb_vehicle_ejb.jar.sun-ejb-jar.xml");
            if(ejbResURL1 != null) {
              localTx_security_ejb_vehicle_ejb.addAsManifestResource(ejbResURL1, "sun-ejb-jar.xml");
            }
            // Call the archive processor
            archiveProcessor.processEjbArchive(localTx_security_ejb_vehicle_ejb, securityClient1.class, ejbResURL1);

        // Ear
            EnterpriseArchive localTx_security_ejb_vehicle_ear = ShrinkWrap.create(EnterpriseArchive.class, "localTx_security_ejb_vehicle.ear");

            // Any libraries added to the ear

            // The component jars built by the package target
            localTx_security_ejb_vehicle_ear.addAsModule(localTx_security_ejb_vehicle_ejb);
            localTx_security_ejb_vehicle_ear.addAsModule(localTx_security_ejb_vehicle_client);



            // The application.xml descriptor
            URL earResURL = null;
            // Call the archive processor
            archiveProcessor.processEarArchive(localTx_security_ejb_vehicle_ear, securityClient1.class, earResURL);
        return localTx_security_ejb_vehicle_ear;
        }

        @Test
        @Override
        @TargetVehicle("ejb")
        public void testContainerManaged() throws java.lang.Exception {
            super.testContainerManaged();
        }

        @Test
        @Override
        @TargetVehicle("ejb")
        public void testComponentManaged() throws java.lang.Exception {
            super.testComponentManaged();
        }

        @Test
        @Override
        @TargetVehicle("ejb")
        public void testAppEISSignon() throws java.lang.Exception {
            super.testAppEISSignon();
        }

        @Test
        @Override
        @TargetVehicle("ejb")
        public void testCBTestCPCandNullPrin() throws java.lang.Exception {
            super.testCBTestCPCandNullPrin();
        }

        @Test
        @Override
        @TargetVehicle("ejb")
        public void testCBTestCPCandGPC() throws java.lang.Exception {
            super.testCBTestCPCandGPC();
        }

        @Test
        @Override
        @TargetVehicle("ejb")
        public void testCBTestAllCallbacksAndPrin() throws java.lang.Exception {
            super.testCBTestAllCallbacksAndPrin();
        }

        @Test
        @Override
        @TargetVehicle("ejb")
        public void testCBTestCPCandPrin() throws java.lang.Exception {
            super.testCBTestCPCandPrin();
        }

        @Test
        @Override
        @TargetVehicle("ejb")
        public void testCBTestAllCallbacksNullPrin() throws java.lang.Exception {
            super.testCBTestAllCallbacksNullPrin();
        }

        @Test
        @Override
        @TargetVehicle("ejb")
        public void testCBTestCPCandPVC() throws java.lang.Exception {
            super.testCBTestCPCandPVC();
        }

        @Test
        @Override
        @TargetVehicle("ejb")
        public void testCBTestGPCandCPCFail() throws java.lang.Exception {
            super.testCBTestGPCandCPCFail();
        }

        @Test
        @Override
        @TargetVehicle("ejb")
        public void testCBTestEISCPCandPrin() throws java.lang.Exception {
            super.testCBTestEISCPCandPrin();
        }

        @Test
        @Override
        @TargetVehicle("ejb")
        public void testConnManagerAllocateConnection() throws java.lang.Exception {
            super.testConnManagerAllocateConnection();
        }


}