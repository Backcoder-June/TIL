# June Intro

![Picture](C:\Users\skyst\Desktop\man.jpg)

* *Main Language - Java*
* *Experience - 3 months*
* *Wanting position - Back end*

## Recent Coding Practice

```java
class Calculator{
    int num1;
    int num2;
    String operator;
    public Calculator(int num1, int num2, String operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;  }

    public void print(){
        int result = 0;
        if (this.operator.equals("-")){
            result = this.num1 - this.num2;}
        else if (this.operator.equals("+")){
            result = this.num1 + this.num2; }
        else if (this.operator.equals("*")){
            result = this.num1 * this.num2; }
        else if (this.operator.equals("/")){
            result = this.num1 / this.num2; }
        else {
            System.out.println("인식할 수 없습니다.");return;}
        System.out.println(this.num1 + this.operator + this.num2 + " = " + result + " 입니다.");}
}
```

---



### [June's Github](https://github.com/Backcoder-June/)

### [June's Blog](https://backcoder.tistory.com/)



> **Thank you for Reading my intro! **  
