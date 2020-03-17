//package projectsProgram;

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
		if (this.projects.remove(project)) {

			return true;
		} else {

			return false;
		}
	}
	
	public void displayProject (Project project) {
		System.out.println(project.toString());
	}
	
	public void displayProjects() {
		if (projects.isEmpty()) {
			System.out.println("Project list is empty");
		} else {
			for (Project project: projects)
			System.out.println(project.toString());
		}
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
