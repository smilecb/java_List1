package com.blb.com;
interface Info{
    public void say();
}
enum  Season1 implements Info {
    SPRING("春天",3){
        @Override
        public void say() {
            System.out.println("春天");
        }
    },
    SUMMER("夏天",6){
        @Override
        public void say() {
            System.out.println("夏天");
        }
    },
    FULL("秋天",9){
        @Override
        public void say() {
            System.out.println("秋天");
        }
    },
    WINTER("冬天",12){
        @Override
        public void say() {
            System.out.println("冬天");
        }
    };
    private final String season;
   private final  int day;

   private Season1(String season,int day)
   {
       this.season=season;
       this.day=day;
   }

    public String getSeason() {
        return season;
    }

    public int getDay() {
        return day;
    }

}
class text2{
    public static void main(String[] args) {
        Season1 spring = Season1.SPRING;
        System.out.println(spring);
        Season1 summer = Season1.SUMMER;
        System.out.println(summer);
        System.out.println("=========================");
        Season1[] values = Season1.values();
        for(Season1 season1:values)
        {
            System.out.println(season1);
            season1.say();
        }
        System.out.println("----------------");
        Season1 season1 = Season1.valueOf("SPRING");
        System.out.println(season1);
        System.out.println(season1.toString());
    }
}