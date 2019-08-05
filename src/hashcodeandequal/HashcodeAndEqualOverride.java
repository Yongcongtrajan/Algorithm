package hashcodeandequal;

import java.util.Objects;

public class HashcodeAndEqualOverride {
    /*You must override hashCode() in every class that overrides equals().
    Failure to do so will result in a violation of the general contract for Object.hashCode(),
    which will prevent your class from functioning properly in conjunction with all hash-based collections,
    including HashMap, HashSet, and Hashtable*/
    public static class User {
        private String name;
        private int age;
        private String passport;

        private User(String name, int age, String passport) {
            this.name = name;
            this.age = age;
            this.passport = passport;
        }

        @Override
        public boolean equals(Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof User)) {
                return false;
            }
            User user = (User) object;
            return user.name.equals(name) &&
                    user.age == age &&
                    user.passport.equals(passport);

        }

       /* @Override
        public boolean equals(Object o) {

            if (o == this) return true;
            if (!(o instanceof User)) {
                return false;
            }
            User user = (User) o;
            return age == user.age &&
                    Objects.equals(name, user.name) &&
                    Objects.equals(passport, user.passport);
        }*/

        /*@Override
        public int hashCode() {
            int result = 17;
            result = 31 * result + name.hashCode();
            result = 31 * result + age;
            result = 31 * result + passport.hashCode();
            return result;
        }*/

        @Override
        public int hashCode() {
            return Objects.hash(name, age, passport);
        }


    }

    public static void main(String[] args) {
        User user1 = new User("yongcong", 19, "111222333");
        User user2 = new User("yongcong", 19, "111222333");
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());

        System.out.println(user1.equals(user2));
    }
}
