package projectsProgram;

public class CompanyTest {

	public static void main(String[] args) {
		String projectTitle, startDate, endDate;
		Company projects = new Company("Test");
		Integer option;
		do {
			System.out.println("0: Quit");
			System.out.println("1: Add a project");
			System.out.println("2: Find a project");
			System.out.println("3: Remove a project");
			System.out.println("4: Display all projects");
			option = Input.getInteger("Option: ");
			switch (option) {
			case 0:
				System.out.println("Quitting program");
				break;
			case 1:	
				projectTitle = Input.getString("Project title: ");	
				startDate = Input.getString("Project start date: ");
				endDate = Input.getString("Project end date: ");
				projects.addProject(new Project(projectTitle, startDate, endDate));
				break;
			case 2:
				projectTitle = Input.getString("Project title: ");
				projects.findAndDisplay(projectTitle);
				break;
			case 3:
				projectTitle = Input.getString("Project title: ");
				projects.removeProject(projects.findProject(projectTitle));
				break;
			case 4:
				projects.displayProjects();
				break;
			default:
				System.out.println("Invalid option");
			}
		} while (option != 0);

	}

}
