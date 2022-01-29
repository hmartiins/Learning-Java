package classAndMethods;

import java.util.Objects;

public class User {

    String name;
    String email;

    public boolean equals(Object obj) {
        if(!(obj instanceof User)) {
            return false;
        }

        User another = (User) obj;

        boolean equalName = Objects.equals(another.name, this.name);
        boolean equalEmail = Objects.equals(another.email, this.email);

        return equalEmail && equalName;
    }
    // HashCode will still be addressed

}
