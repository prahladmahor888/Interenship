public interface StudentOperations {
    void addStudent(Student student);
    void remove(int id) throws StudentNotFoundException ;
    void update(int id, String name, String course, int age, float marks);
    void search(String name);
    void viewStudent(int id);
    void viewAll();
}
