class Company {
    String name;
    int requiredCandidates;

    public Company(String name, int requiredCandidates) {
        this.name = name;
        this.requiredCandidates = requiredCandidates;
    }
}

class JobPortal {
    public String applyJob(Company jobData, String companyName, int numberOfCandidates) throws Exception {
        if (!jobData.name.equals(companyName)) {
            throw new CompanyNotFoundException("no such company found");
        } else if (jobData.requiredCandidates < numberOfCandidates) {
            throw new NoVacancyFoundException("no vacancy available");
        } else {
            jobData.requiredCandidates -= numberOfCandidates;
            return "applied successfully";
        }
    }
}

class CompanyNotFoundException extends Exception {
    public CompanyNotFoundException(String str) {
        super(str);
    }
}

class NoVacancyFoundException extends Exception {
    public NoVacancyFoundException(String str) {
        super(str);
    }
}



import java.util.Scanner;

class Source {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter company name: ");
        String companyName = sc.nextLine();
        System.out.print("Enter number of required candidates: ");
        int requiredCandidates = sc.nextInt();
        System.out.print("Enter company name to apply for job: ");
        String applyCompanyName = sc.nextLine();
        sc.nextLine(); // consume newline left-over
        System.out.print("Enter number of candidates to apply for job: ");
        int applyNumberOfCandidates = sc.nextInt();

        Company jobData = new Company(companyName, requiredCandidates);

        
        JobPortal jobPortal = new JobPortal();

        try {
            String result = jobPortal.applyJob(jobData, applyCompanyName, applyNumberOfCandidates);
            System.out.println(result);
        } catch (CompanyNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (NoVacancyFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
