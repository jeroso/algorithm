package BOJ._10825;

public class Person implements Comparable<Person> {
    String name;
    int kor, eng, math;

    public Person(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int compareTo(Person that) {
        if (this.kor > that.kor) {
            return -1;
        } else if (this.kor == that.kor) {
            if (this.eng > that.eng) {
                return -1;
            } else if (this.eng == that.eng) {
                if (this.math > that.math) {
                    return -1;
                } else if (this.math == that.math) {
                    return this.name.compareTo(that.name);
                }
            }
        }
        return 1;
    }
}
