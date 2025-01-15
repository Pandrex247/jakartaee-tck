package ee.jakarta.tck.persistence.core.entityManager2;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.container.test.api.OverProtocol;
import org.jboss.arquillian.container.test.api.TargetsContainer;
import org.jboss.arquillian.junit5.ArquillianExtension;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import tck.arquillian.porting.lib.spi.TestArchiveProcessor;
import tck.arquillian.protocol.common.TargetVehicle;

import java.net.URL;



@ExtendWith(ArquillianExtension.class)
@Tag("persistence")
@Tag("platform")
@Tag("web")
@Tag("tck-javatest")

@TestMethodOrder(MethodOrderer.MethodName.class)
public class Client1PuservletTest extends ee.jakarta.tck.persistence.core.entityManager2.Client1 {
    static final String VEHICLE_ARCHIVE = "jpa_core_entityManager2_puservlet_vehicle";

        /**
        EE10 Deployment Descriptors:
        jpa_core_entityManager2: META-INF/persistence.xml
        jpa_core_entityManager2_appmanagedNoTx_vehicle_client: META-INF/application-client.xml
        jpa_core_entityManager2_appmanagedNoTx_vehicle_ejb: jar.sun-ejb-jar.xml
        jpa_core_entityManager2_pmservlet_vehicle_web: WEB-INF/web.xml
        jpa_core_entityManager2_puservlet_vehicle_web: WEB-INF/web.xml
        jpa_core_entityManager2_stateless3_vehicle_client: META-INF/application-client.xml
        jpa_core_entityManager2_stateless3_vehicle_ejb: jar.sun-ejb-jar.xml
        jpa_core_entityManager2_vehicles: 

        Found Descriptors:
        War:

        /com/sun/ts/tests/common/vehicle/puservlet/puservlet_vehicle_web.xml
        Ear:

        */
        @TargetsContainer("tck-javatest")
        @OverProtocol("javatest")
        @Deployment(name = VEHICLE_ARCHIVE, order = 2)
        public static WebArchive createDeploymentVehicle(@ArquillianResource TestArchiveProcessor archiveProcessor) {
        // War
            // the war with the correct archive name
            WebArchive jpa_core_entityManager2_puservlet_vehicle_web = ShrinkWrap.create(WebArchive.class, "jpa_core_entityManager2_puservlet_vehicle_web.war");
            // The class files
            jpa_core_entityManager2_puservlet_vehicle_web.addClasses(
            ee.jakarta.tck.persistence.core.entityManager2.Client1.class,
            com.sun.ts.tests.common.vehicle.ejb3share.EJB3ShareBaseBean.class,
            com.sun.ts.tests.common.vehicle.VehicleRunnerFactory.class,
            com.sun.ts.tests.common.vehicle.ejb3share.UseEntityManager.class,
            com.sun.ts.tests.common.vehicle.ejb3share.EJB3ShareIF.class,
            com.sun.ts.tests.common.vehicle.puservlet.PUServletVehicle.class,
            com.sun.ts.lib.harness.EETest.Fault.class,
            com.sun.ts.tests.common.vehicle.ejb3share.UseEntityManagerFactory.class,
            ee.jakarta.tck.persistence.common.PMClientBase.class,
            com.sun.ts.tests.common.vehicle.servlet.ServletVehicle.class,
            com.sun.ts.tests.common.vehicle.VehicleRunnable.class,
            com.sun.ts.tests.common.vehicle.ejb3share.UserTransactionWrapper.class,
            com.sun.ts.lib.harness.EETest.class,
            com.sun.ts.lib.harness.ServiceEETest.class,
            com.sun.ts.tests.common.vehicle.ejb3share.EntityTransactionWrapper.class,
            com.sun.ts.lib.harness.EETest.SetupException.class,
            com.sun.ts.tests.common.vehicle.VehicleClient.class,
            com.sun.ts.tests.common.vehicle.ejb3share.NoopTransactionWrapper.class
            );
            // The web.xml descriptor
            URL warResURL = Client1.class.getResource("/com/sun/ts/tests/common/vehicle/puservlet/puservlet_vehicle_web.xml");
            if(warResURL != null) {
              jpa_core_entityManager2_puservlet_vehicle_web.addAsWebInfResource(warResURL, "web.xml");
            }
            // The sun-web.xml descriptor
            warResURL = Client1.class.getResource("//com/sun/ts/tests/common/vehicle/puservlet/puservlet_vehicle_web.war.sun-web.xml");
            if(warResURL != null) {
              jpa_core_entityManager2_puservlet_vehicle_web.addAsWebInfResource(warResURL, "sun-web.xml");
            }

            // Any libraries added to the war

            // Web content
            warResURL = Client1.class.getResource("/com/sun/ts/tests/jpa/core/entityManager2/jpa_core_entityManager2.jar");
            if(warResURL != null) {
              jpa_core_entityManager2_puservlet_vehicle_web.addAsWebResource(warResURL, "/WEB-INF/lib/jpa_core_entityManager2.jar");
            }
            warResURL = Client1.class.getResource("/com/sun/ts/tests/common/vehicle/puservlet/puservlet_vehicle_web.xml");
            if(warResURL != null) {
              jpa_core_entityManager2_puservlet_vehicle_web.addAsWebResource(warResURL, "/WEB-INF/puservlet_vehicle_web.xml");
            }

           // Call the archive processor
           archiveProcessor.processWebArchive(jpa_core_entityManager2_puservlet_vehicle_web, Client1.class, warResURL);


        // Par
            // the jar with the correct archive name
            JavaArchive jpa_core_entityManager2 = ShrinkWrap.create(JavaArchive.class, "jpa_core_entityManager2.jar");
            // The class files
            jpa_core_entityManager2.addClasses(
                ee.jakarta.tck.persistence.core.entityManager2.Employee.class,
                ee.jakarta.tck.persistence.core.entityManager2.Order.class,
                ee.jakarta.tck.persistence.core.entityManager2.DoesNotExist.class
            );
            // The persistence.xml descriptor
            URL parURL = Client1.class.getResource("persistence.xml");
            if(parURL != null) {
              jpa_core_entityManager2.addAsManifestResource(parURL, "persistence.xml");
            }
            // Add the Persistence mapping-file
            URL mappingURL = Client1.class.getResource("myMappingFile.xml");
            if(mappingURL != null) {
              jpa_core_entityManager2.addAsResource(mappingURL, "myMappingFile.xml");
            }
            mappingURL = Client1.class.getResource("myMappingFile1.xml");
            if(mappingURL != null) {
              jpa_core_entityManager2.addAsResource(mappingURL, "myMappingFile1.xml");
            }
            mappingURL = Client1.class.getResource("myMappingFile2.xml");
            if(mappingURL != null) {
              jpa_core_entityManager2.addAsResource(mappingURL, "myMappingFile2.xml");
            }
            // Call the archive processor
            archiveProcessor.processParArchive(jpa_core_entityManager2, Client1.class, parURL);
            parURL = Client1.class.getResource("orm.xml");
            if(parURL != null) {
              jpa_core_entityManager2.addAsManifestResource(parURL, "orm.xml");
            }

            jpa_core_entityManager2_puservlet_vehicle_web.addAsLibrary(jpa_core_entityManager2);
            return jpa_core_entityManager2_puservlet_vehicle_web;
        }

        @Test
        @Override
        @TargetVehicle("puservlet")
        public void findExceptionsTest() throws java.lang.Exception {
            super.findExceptionsTest();
        }

        @Test
        @Override
        @TargetVehicle("puservlet")
        public void flushExceptionsTest() throws java.lang.Exception {
            super.flushExceptionsTest();
        }

        @Test
        @Override
        @TargetVehicle("puservlet")
        public void entityManagerMethodsRuntimeExceptionsCauseRollback1Test() throws java.lang.Exception {
            super.entityManagerMethodsRuntimeExceptionsCauseRollback1Test();
        }

        @Test
        @Override
        @TargetVehicle("puservlet")
        public void entityManagerMethodsRuntimeExceptionsCauseRollback2Test() throws java.lang.Exception {
            super.entityManagerMethodsRuntimeExceptionsCauseRollback2Test();
        }

        @Test
        @Override
        @TargetVehicle("puservlet")
        public void entityManagerMethodsRuntimeExceptionsCauseRollback3Test() throws java.lang.Exception {
            super.entityManagerMethodsRuntimeExceptionsCauseRollback3Test();
        }

        @Test
        @Override
        @TargetVehicle("puservlet")
        public void entityManagerMethodsRuntimeExceptionsCauseRollback4Test() throws java.lang.Exception {
            super.entityManagerMethodsRuntimeExceptionsCauseRollback4Test();
        }

        @Test
        @Override
        @TargetVehicle("puservlet")
        public void entityManagerMethodsRuntimeExceptionsCauseRollback5Test() throws java.lang.Exception {
            super.entityManagerMethodsRuntimeExceptionsCauseRollback5Test();
        }

        @Test
        @Override
        @TargetVehicle("puservlet")
        public void entityManagerMethodsRuntimeExceptionsCauseRollback6Test() throws java.lang.Exception {
            super.entityManagerMethodsRuntimeExceptionsCauseRollback6Test();
        }

        @Test
        @Override
        @TargetVehicle("puservlet")
        public void entityManagerMethodsRuntimeExceptionsCauseRollback7Test() throws java.lang.Exception {
            super.entityManagerMethodsRuntimeExceptionsCauseRollback7Test();
        }

        @Test
        @Override
        @TargetVehicle("puservlet")
        public void entityManagerMethodsRuntimeExceptionsCauseRollback8Test() throws java.lang.Exception {
            super.entityManagerMethodsRuntimeExceptionsCauseRollback8Test();
        }

        @Test
        @Override
        @TargetVehicle("puservlet")
        public void entityManagerMethodsRuntimeExceptionsCauseRollback9Test() throws java.lang.Exception {
            super.entityManagerMethodsRuntimeExceptionsCauseRollback9Test();
        }

        @Test
        @Override
        @TargetVehicle("puservlet")
        public void entityManagerMethodsRuntimeExceptionsCauseRollback10Test() throws java.lang.Exception {
            super.entityManagerMethodsRuntimeExceptionsCauseRollback10Test();
        }

        @Test
        @Override
        @TargetVehicle("puservlet")
        public void entityManagerMethodsRuntimeExceptionsCauseRollback11Test() throws java.lang.Exception {
            super.entityManagerMethodsRuntimeExceptionsCauseRollback11Test();
        }

        @Test
        @Override
        @TargetVehicle("puservlet")
        public void entityManagerMethodsRuntimeExceptionsCauseRollback12Test() throws java.lang.Exception {
            super.entityManagerMethodsRuntimeExceptionsCauseRollback12Test();
        }

        @Test
        @Override
        @TargetVehicle("puservlet")
        public void entityManagerMethodsRuntimeExceptionsCauseRollback13Test() throws java.lang.Exception {
            super.entityManagerMethodsRuntimeExceptionsCauseRollback13Test();
        }

        @Test
        @Override
        @TargetVehicle("puservlet")
        public void entityManagerMethodsRuntimeExceptionsCauseRollback14Test() throws java.lang.Exception {
            super.entityManagerMethodsRuntimeExceptionsCauseRollback14Test();
        }

        @Test
        @Override
        @TargetVehicle("puservlet")
        public void entityManagerMethodsRuntimeExceptionsCauseRollback15Test() throws java.lang.Exception {
            super.entityManagerMethodsRuntimeExceptionsCauseRollback15Test();
        }

        @Test
        @Override
        @TargetVehicle("puservlet")
        public void entityManagerMethodsRuntimeExceptionsCauseRollback16Test() throws java.lang.Exception {
            super.entityManagerMethodsRuntimeExceptionsCauseRollback16Test();
        }

        @Test
        @Override
        @TargetVehicle("puservlet")
        public void entityManagerMethodsRuntimeExceptionsCauseRollback17Test() throws java.lang.Exception {
            super.entityManagerMethodsRuntimeExceptionsCauseRollback17Test();
        }

        @Test
        @Override
        @TargetVehicle("puservlet")
        public void entityManagerMethodsRuntimeExceptionsCauseRollback21Test() throws java.lang.Exception {
            super.entityManagerMethodsRuntimeExceptionsCauseRollback21Test();
        }

        @Test
        @Override
        @TargetVehicle("puservlet")
        public void entityManagerMethodsRuntimeExceptionsCauseRollback23Test() throws java.lang.Exception {
            super.entityManagerMethodsRuntimeExceptionsCauseRollback23Test();
        }

        @Test
        @Override
        @TargetVehicle("puservlet")
        public void entityManagerMethodsRuntimeExceptionsCauseRollback24Test() throws java.lang.Exception {
            super.entityManagerMethodsRuntimeExceptionsCauseRollback24Test();
        }

        @Test
        @Override
        @TargetVehicle("puservlet")
        public void entityManagerMethodsRuntimeExceptionsCauseRollback25Test() throws java.lang.Exception {
            super.entityManagerMethodsRuntimeExceptionsCauseRollback25Test();
        }

        @Test
        @Override
        @TargetVehicle("puservlet")
        public void entityManagerMethodsRuntimeExceptionsCauseRollback26Test() throws java.lang.Exception {
            super.entityManagerMethodsRuntimeExceptionsCauseRollback26Test();
        }

        @Test
        @Override
        @TargetVehicle("puservlet")
        public void entityManagerMethodsRuntimeExceptionsCauseRollback27Test() throws java.lang.Exception {
            super.entityManagerMethodsRuntimeExceptionsCauseRollback27Test();
        }

        @Test
        @Override
        @TargetVehicle("puservlet")
        public void entityManagerMethodsRuntimeExceptionsCauseRollback28Test() throws java.lang.Exception {
            super.entityManagerMethodsRuntimeExceptionsCauseRollback28Test();
        }

        @Test
        @Override
        @TargetVehicle("puservlet")
        public void entityManagerMethodsRuntimeExceptionsCauseRollback29Test() throws java.lang.Exception {
            super.entityManagerMethodsRuntimeExceptionsCauseRollback29Test();
        }

        @Test
        @Override
        @TargetVehicle("puservlet")
        public void entityManagerMethodsRuntimeExceptionsCauseRollback30Test() throws java.lang.Exception {
            super.entityManagerMethodsRuntimeExceptionsCauseRollback30Test();
        }

        @Test
        @Override
        @TargetVehicle("puservlet")
        public void entityManagerMethodsRuntimeExceptionsCauseRollback31Test() throws java.lang.Exception {
            super.entityManagerMethodsRuntimeExceptionsCauseRollback31Test();
        }

        @Test
        @Override
        @TargetVehicle("puservlet")
        public void entityManagerMethodsRuntimeExceptionsCauseRollback32Test() throws java.lang.Exception {
            super.entityManagerMethodsRuntimeExceptionsCauseRollback32Test();
        }


}