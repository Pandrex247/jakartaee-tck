package ee.jakarta.tck.persistence.core.annotations.access.field;

import com.sun.ts.lib.harness.Status;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.container.test.api.OverProtocol;
import org.jboss.arquillian.container.test.api.TargetsContainer;
import org.jboss.arquillian.junit5.ArquillianExtension;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.StringAsset;
import org.jboss.shrinkwrap.api.spec.EnterpriseArchive;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import tck.arquillian.porting.lib.spi.TestArchiveProcessor;
import tck.arquillian.protocol.common.TargetVehicle;

import java.net.URL;
import java.util.Properties;


@ExtendWith(ArquillianExtension.class)
@Tag("persistence")
@Tag("platform")
@Tag("tck-appclient")

@TestMethodOrder(MethodOrderer.MethodName.class)
public class Client1AppmanagedTest extends ee.jakarta.tck.persistence.core.annotations.access.field.Client1 {
    static final String VEHICLE_ARCHIVE = "jpa_core_annotations_access_field_appmanaged_vehicle";

    public static void main(String[] args) {
        Client1AppmanagedTest theTests = new Client1AppmanagedTest();
        Status s = theTests.run(args, System.out, System.err);
        s.exit();
      }
  
      public void setup(String[] args, Properties p) throws Exception {
          super.setup(args, p);
      }
  
        /**
        EE10 Deployment Descriptors:
        jpa_core_annotations_access_field: META-INF/persistence.xml
        jpa_core_annotations_access_field_appmanaged_vehicle_client: META-INF/application-client.xml
        jpa_core_annotations_access_field_appmanaged_vehicle_ejb: jar.sun-ejb-jar.xml
        jpa_core_annotations_access_field_appmanagedNoTx_vehicle_client: META-INF/application-client.xml
        jpa_core_annotations_access_field_appmanagedNoTx_vehicle_ejb: jar.sun-ejb-jar.xml
        jpa_core_annotations_access_field_pmservlet_vehicle_web: WEB-INF/web.xml
        jpa_core_annotations_access_field_puservlet_vehicle_web: WEB-INF/web.xml
        jpa_core_annotations_access_field_stateful3_vehicle_client: META-INF/application-client.xml
        jpa_core_annotations_access_field_stateful3_vehicle_ejb: jar.sun-ejb-jar.xml
        jpa_core_annotations_access_field_stateless3_vehicle_client: META-INF/application-client.xml
        jpa_core_annotations_access_field_stateless3_vehicle_ejb: jar.sun-ejb-jar.xml
        jpa_core_annotations_access_field_vehicles: 

        Found Descriptors:
        Client:

        /com/sun/ts/tests/common/vehicle/appmanaged/appmanaged_vehicle_client.xml
        Ejb:

        Ear:

        */
        @TargetsContainer("tck-appclient")
        @OverProtocol("appclient")
        @Deployment(name = VEHICLE_ARCHIVE, order = 2)
        public static EnterpriseArchive createDeploymentVehicle(@ArquillianResource TestArchiveProcessor archiveProcessor) {
        // Client
            // the jar with the correct archive name
            JavaArchive jpa_core_annotations_access_field_appmanaged_vehicle_client = ShrinkWrap.create(JavaArchive.class, "jpa_core_annotations_access_field_vehicles_client.jar");
            // The class files
            jpa_core_annotations_access_field_appmanaged_vehicle_client.addClasses(
            com.sun.ts.tests.common.vehicle.VehicleRunnerFactory.class,
            com.sun.ts.tests.common.vehicle.ejb3share.UseEntityManager.class,
            com.sun.ts.tests.common.vehicle.ejb3share.EJB3ShareIF.class,
            com.sun.ts.lib.harness.EETest.Fault.class,
            com.sun.ts.tests.common.vehicle.appmanaged.AppManagedVehicleIF.class,
            com.sun.ts.tests.common.vehicle.ejb3share.UseEntityManagerFactory.class,
            com.sun.ts.tests.common.vehicle.EmptyVehicleRunner.class,
            ee.jakarta.tck.persistence.common.PMClientBase.class,
            com.sun.ts.tests.common.vehicle.VehicleRunnable.class,
            com.sun.ts.tests.common.vehicle.appmanaged.AppManagedVehicleRunner.class,
            com.sun.ts.tests.common.vehicle.ejb3share.UserTransactionWrapper.class,
            com.sun.ts.lib.harness.EETest.class,
            com.sun.ts.lib.harness.ServiceEETest.class,
            com.sun.ts.tests.common.vehicle.ejb3share.EntityTransactionWrapper.class,
            com.sun.ts.lib.harness.EETest.SetupException.class,
            com.sun.ts.tests.common.vehicle.VehicleClient.class,
            com.sun.ts.tests.common.vehicle.ejb3share.NoopTransactionWrapper.class,
            ee.jakarta.tck.persistence.core.annotations.access.field.Client.class,
            ee.jakarta.tck.persistence.core.annotations.access.field.Client1.class,
            Client1AppmanagedTest.class
            );
            // The application-client.xml descriptor
            URL resURL = Client1.class.getResource("/com/sun/ts/tests/common/vehicle/appmanaged/appmanaged_vehicle_client.xml");
            if(resURL != null) {
              jpa_core_annotations_access_field_appmanaged_vehicle_client.addAsManifestResource(resURL, "application-client.xml");
            }
            // The sun-application-client.xml file need to be added or should this be in in the vendor Arquillian extension?
            resURL = Client1.class.getResource("//com/sun/ts/tests/common/vehicle/appmanaged/appmanaged_vehicle_client.jar.sun-application-client.xml");
            if(resURL != null) {
              jpa_core_annotations_access_field_appmanaged_vehicle_client.addAsManifestResource(resURL, "sun-application-client.xml");
            }
            jpa_core_annotations_access_field_appmanaged_vehicle_client.addAsManifestResource(new StringAsset("Main-Class: " + Client1.class.getName() + "\n"), "MANIFEST.MF");
            // Call the archive processor
            archiveProcessor.processClientArchive(jpa_core_annotations_access_field_appmanaged_vehicle_client, Client1.class, resURL);

        // Ejb 1
            // the jar with the correct archive name
            JavaArchive jpa_core_annotations_access_field_appmanaged_vehicle_ejb = ShrinkWrap.create(JavaArchive.class, "jpa_core_annotations_access_field_appmanaged_vehicle_ejb.jar");
            // The class files
            jpa_core_annotations_access_field_appmanaged_vehicle_ejb.addClasses(
                com.sun.ts.tests.common.vehicle.ejb3share.EJB3ShareBaseBean.class,
                com.sun.ts.tests.common.vehicle.VehicleRunnerFactory.class,
                com.sun.ts.tests.common.vehicle.ejb3share.UseEntityManager.class,
                com.sun.ts.tests.common.vehicle.ejb3share.EJB3ShareIF.class,
                com.sun.ts.lib.harness.EETest.Fault.class,
                com.sun.ts.tests.common.vehicle.appmanaged.AppManagedVehicleIF.class,
                com.sun.ts.tests.common.vehicle.ejb3share.UseEntityManagerFactory.class,
                ee.jakarta.tck.persistence.common.PMClientBase.class,
                ee.jakarta.tck.persistence.core.annotations.access.field.Client1.class,
                com.sun.ts.tests.common.vehicle.VehicleRunnable.class,
                com.sun.ts.tests.common.vehicle.appmanaged.AppManagedVehicleBean.class,
                com.sun.ts.tests.common.vehicle.ejb3share.UserTransactionWrapper.class,
                com.sun.ts.lib.harness.EETest.class,
                com.sun.ts.lib.harness.ServiceEETest.class,
                com.sun.ts.tests.common.vehicle.ejb3share.EntityTransactionWrapper.class,
                com.sun.ts.lib.harness.EETest.SetupException.class,
                com.sun.ts.tests.common.vehicle.VehicleClient.class,
                com.sun.ts.tests.common.vehicle.ejb3share.NoopTransactionWrapper.class,
                ee.jakarta.tck.persistence.core.annotations.access.field.DataTypes.class,
                ee.jakarta.tck.persistence.core.annotations.access.field.Client1.class,
                ee.jakarta.tck.persistence.core.annotations.access.field.Client.class
            );
            // The ejb-jar.xml descriptor
            URL ejbResURL1 = Client1.class.getResource("//com/sun/ts/tests/common/vehicle/appmanaged/appmanaged_vehicle_client.xml");
            if(ejbResURL1 != null) {
//              jpa_core_annotations_access_field_appmanaged_vehicle_ejb.addAsManifestResource(ejbResURL1, "ejb-jar.xml");
            }
            // The sun-ejb-jar.xml file
            ejbResURL1 = Client1.class.getResource("//com/sun/ts/tests/common/vehicle/appmanaged/appmanaged_vehicle_ejb.jar.sun-ejb-jar.xml");
            if(ejbResURL1 != null) {
              jpa_core_annotations_access_field_appmanaged_vehicle_ejb.addAsManifestResource(ejbResURL1, "sun-ejb-jar.xml");
            }
            // Call the archive processor
            archiveProcessor.processEjbArchive(jpa_core_annotations_access_field_appmanaged_vehicle_ejb, Client1.class, ejbResURL1);


        // Par
            // the jar with the correct archive name
            JavaArchive jpa_core_annotations_access_field = ShrinkWrap.create(JavaArchive.class, "jpa_core_annotations_access_field.jar");
            // The class files
            jpa_core_annotations_access_field.addClasses(
                ee.jakarta.tck.persistence.core.annotations.access.field.DataTypes.class,
                ee.jakarta.tck.persistence.core.annotations.access.field.DataTypes2.class,
                ee.jakarta.tck.persistence.core.types.common.Grade.class
            );
            // The persistence.xml descriptor
            URL parURL = Client1.class.getResource("persistence.xml");
            if(parURL != null) {
              jpa_core_annotations_access_field.addAsManifestResource(parURL, "persistence.xml");
            }
            // Add the Persistence mapping-file
            URL mappingURL = Client1.class.getResource("myMappingFile.xml");
            if(mappingURL != null) {
              jpa_core_annotations_access_field.addAsResource(mappingURL, "myMappingFile.xml");
            }
            mappingURL = Client1.class.getResource("myMappingFile1.xml");
            if(mappingURL != null) {
              jpa_core_annotations_access_field.addAsResource(mappingURL, "myMappingFile1.xml");
            }
            mappingURL = Client1.class.getResource("myMappingFile2.xml");
            if(mappingURL != null) {
              jpa_core_annotations_access_field.addAsResource(mappingURL, "myMappingFile2.xml");
            }
            // Call the archive processor
            archiveProcessor.processParArchive(jpa_core_annotations_access_field, Client1.class, parURL);
            parURL = Client1.class.getResource("orm.xml");
            if(parURL != null) {
              jpa_core_annotations_access_field.addAsManifestResource(parURL, "orm.xml");
            }

        // Ear
            EnterpriseArchive jpa_core_annotations_access_field_vehicles_ear = ShrinkWrap.create(EnterpriseArchive.class, "jpa_core_annotations_access_field_vehicles.ear");

            // Any libraries added to the ear

            // The component jars built by the package target
            jpa_core_annotations_access_field_vehicles_ear.addAsModule(jpa_core_annotations_access_field_appmanaged_vehicle_ejb);
            jpa_core_annotations_access_field_vehicles_ear.addAsModule(jpa_core_annotations_access_field_appmanaged_vehicle_client);

            jpa_core_annotations_access_field_vehicles_ear.addAsLibrary(jpa_core_annotations_access_field);



            // The application.xml descriptor
            URL earResURL = null;
            // The sun-application.xml descriptor
            earResURL = Client1.class.getResource("/.ear.sun-application.xml");
            if(earResURL != null) {
              jpa_core_annotations_access_field_vehicles_ear.addAsManifestResource(earResURL, "sun-application.xml");
            }
            // Call the archive processor
            archiveProcessor.processEarArchive(jpa_core_annotations_access_field_vehicles_ear, Client1.class, earResURL);
        return jpa_core_annotations_access_field_vehicles_ear;
        }

        @Test
        @Override
        @TargetVehicle("appmanaged")
        public void fieldTypeTest1() throws java.lang.Exception {
            super.fieldTypeTest1();
        }

        @Test
        @Override
        @TargetVehicle("appmanaged")
        public void fieldTypeTest2() throws java.lang.Exception {
            super.fieldTypeTest2();
        }

        @Test
        @Override
        @TargetVehicle("appmanaged")
        public void fieldTypeTest3() throws java.lang.Exception {
            super.fieldTypeTest3();
        }

        @Test
        @Override
        @TargetVehicle("appmanaged")
        public void fieldTypeTest4() throws java.lang.Exception {
            super.fieldTypeTest4();
        }

        @Test
        @Override
        @TargetVehicle("appmanaged")
        public void fieldTypeTest5() throws java.lang.Exception {
            super.fieldTypeTest5();
        }

        @Test
        @Override
        @TargetVehicle("appmanaged")
        public void fieldTypeTest6() throws java.lang.Exception {
            super.fieldTypeTest6();
        }

        @Test
        @Override
        @TargetVehicle("appmanaged")
        public void fieldTypeTest7() throws java.lang.Exception {
            super.fieldTypeTest7();
        }

        @Test
        @Override
        @TargetVehicle("appmanaged")
        public void fieldTypeTest8() throws java.lang.Exception {
            super.fieldTypeTest8();
        }

        @Test
        @Override
        @TargetVehicle("appmanaged")
        public void fieldTypeTest9() throws java.lang.Exception {
            super.fieldTypeTest9();
        }

        @Test
        @Override
        @TargetVehicle("appmanaged")
        public void fieldTypeTest10() throws java.lang.Exception {
            super.fieldTypeTest10();
        }

        @Test
        @Override
        @TargetVehicle("appmanaged")
        public void fieldTypeTest11() throws java.lang.Exception {
            super.fieldTypeTest11();
        }

        @Test
        @Override
        @TargetVehicle("appmanaged")
        public void fieldTypeTest12() throws java.lang.Exception {
            super.fieldTypeTest12();
        }

        @Test
        @Override
        @TargetVehicle("appmanaged")
        public void fieldTypeTest13() throws java.lang.Exception {
            super.fieldTypeTest13();
        }

        @Test
        @Override
        @TargetVehicle("appmanaged")
        public void fieldTypeTest14() throws java.lang.Exception {
            super.fieldTypeTest14();
        }

        @Test
        @Override
        @TargetVehicle("appmanaged")
        public void fieldTypeTest15() throws java.lang.Exception {
            super.fieldTypeTest15();
        }

        @Test
        @Override
        @TargetVehicle("appmanaged")
        public void fieldTypeTest16() throws java.lang.Exception {
            super.fieldTypeTest16();
        }

        @Test
        @Override
        @TargetVehicle("appmanaged")
        public void fieldTypeTest17() throws java.lang.Exception {
            super.fieldTypeTest17();
        }

}
