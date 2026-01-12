
public class TestStudentMain {

    public static void main(String[] args) {

        // 3. สร้างอ็อบเจ็กต์ Student อย่างน้อย 2 คน และเรียกใช้ displayInfo()
        Student student1 = new Student("S001", "โอชิ", "วิทยาการคอมพิวเตอร์", 3.8);
        Student student2 = new Student("S002", "โอโซน", "คณิตศาสตร์", 3.6);

        student1.displayInfo();
        student2.displayInfo();

        // 4. สร้าง array ของ Student
        Student[] students = new Student[3];

        students[0] = new Student("S003", "ปัม", "ฟิสิกส์", 3.7);
        students[1] = new Student("S004", "เกม", "ชีววิทยา", 3.9);
        students[2] = new Student("S002", "โน่", "คณิตศาสตร์", 3.6);

        // 5. แสดงข้อมูลทั้งหมดด้วย loop
        for (Student i : students) {
            i.displayInfo();
        }
    }
}
