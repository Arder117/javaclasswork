// 2. 自定义异常类：
//（1）自定义异常FailureException表示不及格；
//（2）创建程序，显示用户输入的成绩，当成绩小于60时，抛出FailureException异常；
//（3）创建测试类，测试成绩输出，捕获异常，并显示

package experiment6;

public class Grade {
    int score;

    public Grade(int score) {
        this.score = score;
    }

    public void show() throws FailureException {
        if (score < 60) {
            throw new FailureException();
        }
        System.out.println("成绩：" + score);
    }
}
