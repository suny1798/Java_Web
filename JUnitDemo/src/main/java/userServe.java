public class userServe {
    public boolean validateUser(User user) {
        if (user.getName() == null || user.getName().isEmpty()) {
            return false;
        }
        if (user.getAge() < 0 || user.getAge() > 150) {
            return false;
        }
        return true;
    }
}
