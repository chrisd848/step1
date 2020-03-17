//package projectsProgram;

import java.util.Collections;
import java.util.LinkedList;

public class Company {

	private String name;
	private LinkedList<Project> projects = new LinkedList<>();
	
	public Company(String name) {
		this.name = name;
	}

	public void addProject(Project project) {
		this.projects.add(project);
	}

	public Project findProject (String s) {
		for (Project project: projects) {
			if (project.getTitle().equalsIgnoreCase(s)) {
				return project;
			}
		}
		return null;
	}
	
	public Boolean removeProject (Project project) {
		return this.projects.remove(project);
	}
	
	public void displayProject (Project project) {
		System.out.println(project.toString());
	}

	public void displayAllProjects() {
		if (projects.isEmpty()) {
			System.out.println("Project list is empty");
		} else {
			Collections.sort(projects);
			for (Project project: projects)
			displayProject(project);
		}
	}

	// Only exists for testing purposes and will be deleted before release
	public void populateObject() {
		projects.add(new Project("E", "05/09/19","19/10/19"));
		projects.add(new Project("C", "03/07/17","17/08/17"));
		projects.add(new Project("F", "06/10/20","20/11/20"));
		projects.add(new Project("G", "07/11/20","21/12/20"));
		projects.add(new Project("A", "01/05/15","15/06/15"));
		projects.add(new Project("D", "04/08/18","18/09/18"));
		projects.add(new Project("B", "02/06/16","16/07/16"));
		System.out.println("Populated object with test data");
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public LinkedList<Project> getProjects() {
		return projects;
	}
	
	public void setProjects (LinkedList<Project> projects) {
		this.projects = projects;
	}
	}
