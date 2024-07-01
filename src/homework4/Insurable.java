// 题目：在第三次作业第1题的基础上，声明Insurable接口，观察多态特性。
//要求：
//（1）声明Insurable接口，包含计算保费方法calculatePremium()；
//（2）员工类和管理者类均实现此接口，拥有不同的保费计算规则。具体规则不限，只需与对象的age属性取值有关即可；
//（3）主函数：创建包含5个员工类对象的数组，运行时首先产生随机数，根据结果随机指向一个员工类或管理者类的引用，调用计算保费方法，体现多态性。

package homework4;

import homework3.Manager;

public interface Insurable{
    public double calculatePremium();
}

