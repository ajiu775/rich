package study.innerclass;

/**
 * @Description: 学习内部类
 * @Author: Mr.Xing
 * @Date: 2019/1/17/16:31
 */
public class Outer01 {
    class Inner {
        private String myName = "内部类01";
        private Integer myNumber = 1;

        public String getMyname() {
            return myName;
        }

        public Integer getMyNumber() {
            return myNumber;
        }
    }

    public Inner getInternalClass() {
        return new Inner();
    }

    public static void main(String[] args) {
        Outer01 outer01 = new Outer01();
        Outer01.Inner inner = outer01.getInternalClass();
        System.out.println("我的名字是:" + inner.getMyname() + "\n" + "我的序号是：" + inner.getMyNumber());
    }
}