package com.kovko;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

@Mojo(name = "hello", defaultPhase = LifecyclePhase.COMPILE)
public class HelloMojo extends AbstractMojo {

	@Parameter(property = "name")
	String name = "";
	@Parameter(defaultValue = "${project}", readonly = true, required = true)
	MavenProject mavenProject;

	public void execute() {
		getLog().info("Hello " + name + " from "  + mavenProject.getName());
	}
}
