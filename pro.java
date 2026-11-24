class UniversityMember {
    int memberId = 101;

    void checkIn() {
        System.out.println("Member checked in");
    }
}

class Staff extends UniversityMember {
    String department;

    void attendMeeting() {
        System.out.println("Department: " + department);
        System.out.println("Attending meeting");
    }
}

class Professor extends Staff {
    String subject;

    void conductLecture() {
        System.out.println("Subject: " + subject);
        System.out.println("Conducting lecture");
    }
}

class AdminOfficer extends Staff {
    String officeRoom;

    void processFiles() {
        System.out.println("Office Room: " + officeRoom);
        System.out.println("Processing files");
    }
}

public class pro {
    public static void main(String[] args) {

        Professor p = new Professor();
        AdminOfficer a = new AdminOfficer();

        p.memberId = 101;
        p.department = "CSE";
        p.subject = "Java";

        a.memberId = 102;
        a.department = "Administration";
        a.officeRoom = "Room 101";

        p.checkIn();
        p.attendMeeting();
        p.conductLecture();

        System.out.println();

        a.checkIn();
        a.attendMeeting();
        a.processFiles();
    }
}