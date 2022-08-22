package com.github.olingo.example.config;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.github.olingo.example.service.OdataJpaServiceFactory;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Paths;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.internal.MapPropertiesDelegate;
import org.glassfish.jersey.message.internal.OutboundJaxrsResponse;
import org.glassfish.jersey.message.internal.OutboundMessageContext;
import org.glassfish.jersey.server.ContainerRequest;
import org.glassfish.jersey.server.ContainerResponse;
import org.hibernate.boot.spi.AbstractDelegatingSessionFactoryOptions;
import org.hibernate.engine.spi.SessionDelegatorBaseImpl;

import org.hibernate.engine.spi.SessionFactoryDelegatingImpl;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.procedure.internal.ProcedureCallImpl;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class JerseyConfigTest {
    /**
     * Method under test: {@link JerseyConfig.EntityManagerFilter#EntityManagerFilter(EntityManagerFactory)}
     */
    @Test
    void testEntityManagerFilterConstructor() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     EntityManagerFilter.entityManagerFactory
        //     EntityManagerFilter.httpRequest

        new JerseyConfig.EntityManagerFilter(new SessionFactoryDelegatingImpl(
                new SessionFactoryDelegatingImpl(new SessionFactoryDelegatingImpl(new SessionFactoryDelegatingImpl(null)))));
    }

    /**
     * Method under test: {@link JerseyConfig.EntityManagerFilter#filter(ContainerRequestContext)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEntityManagerFilterFilter() throws IOException {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.github.olingo.example.config.JerseyConfig$EntityManagerFilter.filter(JerseyConfig.java:74)
        //   In order to prevent filter(ContainerRequestContext)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   filter(ContainerRequestContext).
        //   See https://diff.blue/R013 to resolve this issue.

        SessionFactoryImplementor sessionFactoryImplementor = mock(SessionFactoryImplementor.class);
        when(sessionFactoryImplementor.createEntityManager())
                .thenReturn(new SessionDelegatorBaseImpl(new SessionDelegatorBaseImpl(new SessionDelegatorBaseImpl(
                        new SessionDelegatorBaseImpl(new SessionDelegatorBaseImpl(mock(SessionImplementor.class)))))));
        JerseyConfig.EntityManagerFilter entityManagerFilter = new JerseyConfig.EntityManagerFilter(
                new SessionFactoryDelegatingImpl(new SessionFactoryDelegatingImpl(
                        new SessionFactoryDelegatingImpl(new SessionFactoryDelegatingImpl(new SessionFactoryDelegatingImpl(
                                new SessionFactoryDelegatingImpl(new SessionFactoryDelegatingImpl(new SessionFactoryDelegatingImpl(
                                        new SessionFactoryDelegatingImpl(sessionFactoryImplementor))))))))));
        URI baseUri = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri();
        URI requestUri = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri();
        entityManagerFilter.filter(
                new ContainerRequest(baseUri, requestUri, "https://example.org/example", null, new MapPropertiesDelegate()));
    }

    /**
     * Method under test: {@link JerseyConfig.EntityManagerFilter#filter(ContainerRequestContext)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEntityManagerFilterFilter2() throws IOException {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at org.hibernate.engine.spi.SessionFactoryDelegatingImpl.createEntityManager(SessionFactoryDelegatingImpl.java:460)
        //       at org.hibernate.engine.spi.SessionFactoryDelegatingImpl.createEntityManager(SessionFactoryDelegatingImpl.java:460)
        //       at org.hibernate.engine.spi.SessionFactoryDelegatingImpl.createEntityManager(SessionFactoryDelegatingImpl.java:460)
        //       at org.hibernate.engine.spi.SessionFactoryDelegatingImpl.createEntityManager(SessionFactoryDelegatingImpl.java:460)
        //       at org.hibernate.engine.spi.SessionFactoryDelegatingImpl.createEntityManager(SessionFactoryDelegatingImpl.java:460)
        //       at org.hibernate.engine.spi.SessionFactoryDelegatingImpl.createEntityManager(SessionFactoryDelegatingImpl.java:460)
        //       at org.hibernate.engine.spi.SessionFactoryDelegatingImpl.createEntityManager(SessionFactoryDelegatingImpl.java:460)
        //       at org.hibernate.engine.spi.SessionFactoryDelegatingImpl.createEntityManager(SessionFactoryDelegatingImpl.java:460)
        //       at com.github.olingo.example.config.JerseyConfig$EntityManagerFilter.filter(JerseyConfig.java:73)
        //   In order to prevent filter(ContainerRequestContext)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   filter(ContainerRequestContext).
        //   See https://diff.blue/R013 to resolve this issue.

        JerseyConfig.EntityManagerFilter entityManagerFilter = new JerseyConfig.EntityManagerFilter(
                new SessionFactoryDelegatingImpl(new SessionFactoryDelegatingImpl(new SessionFactoryDelegatingImpl(
                        new SessionFactoryDelegatingImpl(new SessionFactoryDelegatingImpl(new SessionFactoryDelegatingImpl(
                                new SessionFactoryDelegatingImpl(new SessionFactoryDelegatingImpl(null)))))))));
        URI baseUri = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri();
        URI requestUri = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri();
        entityManagerFilter.filter(
                new ContainerRequest(baseUri, requestUri, "https://example.org/example", null, new MapPropertiesDelegate()));
    }

    /**
     * Method under test: {@link JerseyConfig.EntityManagerFilter#filter(ContainerRequestContext, ContainerResponseContext)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEntityManagerFilterFilter3() throws IOException {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.github.olingo.example.config.JerseyConfig$EntityManagerFilter.filter(JerseyConfig.java:82)
        //   In order to prevent filter(ContainerRequestContext, ContainerResponseContext)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   filter(ContainerRequestContext, ContainerResponseContext).
        //   See https://diff.blue/R013 to resolve this issue.

        JerseyConfig.EntityManagerFilter entityManagerFilter = new JerseyConfig.EntityManagerFilter(
                new SessionFactoryDelegatingImpl(new SessionFactoryDelegatingImpl(
                        new SessionFactoryDelegatingImpl(new SessionFactoryDelegatingImpl(null)))));
        URI baseUri = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri();
        URI requestUri = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri();
        ContainerRequest requestContext = new ContainerRequest(baseUri, requestUri, "https://example.org/example", null,
                new MapPropertiesDelegate());

        URI baseUri1 = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri();
        URI requestUri1 = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri();
        ContainerRequest requestContext1 = new ContainerRequest(baseUri1, requestUri1, "https://example.org/example", null,
                new MapPropertiesDelegate());

        entityManagerFilter.filter(requestContext, new ContainerResponse(requestContext1,
                (Response) new OutboundJaxrsResponse(null, new OutboundMessageContext())));
    }

    /**
     * Method under test: {@link JerseyConfig.EntityManagerFilter#filter(ContainerRequestContext, ContainerResponseContext)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEntityManagerFilterFilter4() throws IOException {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.github.olingo.example.config.JerseyConfig$EntityManagerFilter.filter(JerseyConfig.java:82)
        //   In order to prevent filter(ContainerRequestContext, ContainerResponseContext)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   filter(ContainerRequestContext, ContainerResponseContext).
        //   See https://diff.blue/R013 to resolve this issue.

        SessionFactoryDelegatingImpl sessionFactoryDelegatingImpl = mock(SessionFactoryDelegatingImpl.class);
        doNothing().when(sessionFactoryDelegatingImpl).addNamedQuery((String) any(), (Query) any());
        AbstractDelegatingSessionFactoryOptions abstractDelegatingSessionFactoryOptions = mock(
                AbstractDelegatingSessionFactoryOptions.class);
        when(abstractDelegatingSessionFactoryOptions.isProcedureParameterNullPassingEnabled()).thenReturn(true);
        SessionFactoryDelegatingImpl sessionFactoryDelegatingImpl1 = mock(SessionFactoryDelegatingImpl.class);
        when(sessionFactoryDelegatingImpl1.getSessionFactoryOptions())
                .thenReturn(new AbstractDelegatingSessionFactoryOptions(new AbstractDelegatingSessionFactoryOptions(
                        new AbstractDelegatingSessionFactoryOptions(new AbstractDelegatingSessionFactoryOptions(
                                new AbstractDelegatingSessionFactoryOptions(abstractDelegatingSessionFactoryOptions))))));
        SessionDelegatorBaseImpl sessionDelegatorBaseImpl = mock(SessionDelegatorBaseImpl.class);
        when(sessionDelegatorBaseImpl.getFactory())
                .thenReturn(new SessionFactoryDelegatingImpl(new SessionFactoryDelegatingImpl(new SessionFactoryDelegatingImpl(
                        new SessionFactoryDelegatingImpl(new SessionFactoryDelegatingImpl(sessionFactoryDelegatingImpl1))))));
        ProcedureCallImpl<Object> query = new ProcedureCallImpl<>(new SessionDelegatorBaseImpl(
                new SessionDelegatorBaseImpl(new SessionDelegatorBaseImpl(sessionDelegatorBaseImpl))), "Procedure Name");

        SessionFactoryDelegatingImpl sessionFactoryDelegatingImpl2 = new SessionFactoryDelegatingImpl(
                sessionFactoryDelegatingImpl);
        sessionFactoryDelegatingImpl2.addNamedQuery("Name", query);
        JerseyConfig.EntityManagerFilter entityManagerFilter = new JerseyConfig.EntityManagerFilter(
                new SessionFactoryDelegatingImpl(
                        new SessionFactoryDelegatingImpl(new SessionFactoryDelegatingImpl(sessionFactoryDelegatingImpl2))));
        URI baseUri = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri();
        URI requestUri = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri();
        ContainerRequest requestContext = new ContainerRequest(baseUri, requestUri, "https://example.org/example", null,
                new MapPropertiesDelegate());

        URI baseUri1 = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri();
        URI requestUri1 = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri();
        ContainerRequest requestContext1 = new ContainerRequest(baseUri1, requestUri1, "https://example.org/example", null,
                new MapPropertiesDelegate());

        entityManagerFilter.filter(requestContext, new ContainerResponse(requestContext1,
                (Response) new OutboundJaxrsResponse(null, new OutboundMessageContext())));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link JerseyConfig.ODataServiceRootLocator#ODataServiceRootLocator(OdataJpaServiceFactory)}
     *   <li>{@link JerseyConfig.ODataServiceRootLocator#getServiceFactory()}
     * </ul>
     */
    @Test
    void testODataServiceRootLocatorConstructor() {
        OdataJpaServiceFactory odataJpaServiceFactory = new OdataJpaServiceFactory();
        assertSame(odataJpaServiceFactory,
                (new JerseyConfig.ODataServiceRootLocator(odataJpaServiceFactory)).getServiceFactory());
    }
}

