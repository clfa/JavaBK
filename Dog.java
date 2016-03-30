public class Dog {
    String m_strName;	/* Dog name */
    String m_strbreed;// Dog breed
    int m_nage;// Dog age
    String m_strColor;// Dog color

    void barking() {
    }

    void hungry() {
    }

    void sleeping() {
    }
 
    public void setAge( int age ) {
        m_nage = age;
    }

    public int getAge() {
        System.out.println( "Dog's age is :" + m_nage );
        return m_nage;
    }

    public void Initial() {
        System.out.println( "Dog Information: " );
        System.out.println( "Name: " + m_strName );
        System.out.println( "Age: " + m_nage );
        System.out.println( "Color: " + m_strColor );
    }

    public Dog() {
    }

    public Dog(String name) {
        m_strName = name;
    }

    public static void main(String[] args) {
        Dog adog = new Dog( "Meimei" );
        adog.setAge( 2 );
        adog.getAge();
    }
}




















