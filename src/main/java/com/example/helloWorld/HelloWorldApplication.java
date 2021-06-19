package com.example.helloWorld;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class HelloWorldApplication extends Application<HelloWorldConfiguration> {

    public static void main(String[] args) throws Exception{
        new HelloWorldApplication().run(args);
    }

    @Override
    public void run(HelloWorldConfiguration configuration, Environment environment) throws Exception {
        final HelloWorldResource resource = new HelloWorldResource(
                configuration.getTemplate(),
                configuration.getDefaultName()
        );
        final ApplicationHealthCheck healthCheck = new ApplicationHealthCheck(configuration.getTemplate());
        environment.healthChecks().register("dropWizardApplicationHealth",healthCheck);
        environment.jersey().register(resource);
    }
    //Add configuration by adding application with below params
    // Running on intellij , add server example.yml in program arguments
}
