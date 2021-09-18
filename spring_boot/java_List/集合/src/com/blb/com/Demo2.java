package com.blb.com;

import org.junit.Test;

import java.sql.Array;
import java.util.*;

/**
 * @author smilecb
 * @date 2021/9/11 0011 14:08
 */
public class Demo2 {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        Iterator<Object> iterator = arrayList.iterator();
        //遍历方式一
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println("================================");
        iterator= arrayList.iterator();
        //遍历方式二
        for(int i=0;i<arrayList.size();i++)
        {
            System.out.println(iterator.next());
        }

        iterator=arrayList.iterator();
        System.out.println("================================");
        //遍历方式三
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
   @Test
    public void tes1(){
       ArrayList<Object> arrayList = new ArrayList<>();
       arrayList.add(1);
       arrayList.add(2);
       arrayList.add(3);
       Iterator<Object> iterator = arrayList.iterator();
       while(iterator.hasNext())
       {
           int next = (int)iterator.next();
           if(next==1)
           {
               iterator.remove();
           }
       }
       iterator=arrayList.iterator();
       while(iterator.hasNext())
       {
           System.out.println(iterator.next());
       }
   }
   @Test
    public void text2()
   {
       ArrayList<Object> arrayList = new ArrayList<>();
       arrayList.add(1);
       arrayList.add(2);
       arrayList.add(3);
       for(Object x:arrayList)
       {
           System.out.println(x);
       }
   }
   @Test
    public void test3()
   {
       ArrayList<Object> list = new ArrayList<>();
//       LinkedList<Object> list = new LinkedList<>();
       list.add(1);//增
       list.add(2);
       list.add(3);

       //差
       for(int i=0;i<list.size();i++)
       {
           System.out.println(list.get(i));
       }
       list.remove(2);//通过下标删除
       System.out.println("=====================");
       for(Object o:list)
       {
           System.out.println(o);
       }
       list.set(0,10);//改
       System.out.println("======================");
       for(Object o:list)
       {
           System.out.println(o);
       }
       list.remove(new Integer(10));//通过值删除
       System.out.println("=======================");
       for(Object o:list)
       {
           System.out.println(o);
       }

   }
   @Test
    public void test4()
   {
       HashSet<Object> hashSet = new LinkedHashSet<>();
       hashSet.add(1);
       hashSet.add(3);
       hashSet.add(1);
       hashSet.add("hollow word");
       hashSet.add("hi");
       for(Object o:hashSet)
       {
           System.out.println(o);
       }
   }

   @Test
    public void test5(){
       TreeSet<People> treeSet = new TreeSet<>();
       treeSet.add(new People("zhangsan",19));
       treeSet.add(new People("zhangsan",90));
       treeSet.add(new People("lisi",23));
       treeSet.add(new People("wangqiang",44));
       treeSet.add(new People("aa",35));
       Iterator<People> iterator = treeSet.iterator();
       while (iterator.hasNext())
       {
           System.out.println(iterator.next());
       }
   }
   @Test
    public void text6()
   {
       Comparator comparator = new Comparator(){
           @Override
           public int compare(Object o1, Object o2) {
               if(o1 instanceof  People && o2 instanceof  People) {
                      People p1=(People) o1;
                   People p2=(People) o2;
                   if(p1.getAge()!=p2.getAge())
                   {
                       return p1.getAge()>p2.getAge()?1:-1;
                   }
                   else
                       return p1.getName().compareTo(p2.getName());
               }
               return 0;
           }
       };
       TreeSet treeSet = new TreeSet<>(comparator);
       treeSet.add(new People("zhangsan",19));
       treeSet.add(new People("zhangsan",90));
       treeSet.add(new People("lisi",23));
       treeSet.add(new People("wangqiang",44));
       treeSet.add(new People("aa",35));
       Iterator iterator = treeSet.iterator();
       while (iterator.hasNext())
       {
           System.out.println(iterator.next());
       }
   }
   @Test
    public void test7()
   {
       HashMap<Object, Object> map = new HashMap<>();
       HashSet set = new HashSet();
       Person p1 = new Person(1001,"AA");
       Person p2 = new Person(1002,"BB");
       set.add(p1);
       set.add(p2);
       System.out.println(set);
       p1.setName("CC");
       set.remove(p1);
       System.out.println(set);
       System.out.println("=================");
       set.add(new Person(1001,"CC"));
       System.out.println(set);
       System.out.println("================");
       set.add(new Person(1001,"AA"));
       System.out.println(set);
   }
   @Test
    public void text8()
   {
       HashMap<Object, Object> hashMap = new HashMap<>();
       //添加
       hashMap.put("a",1);

       hashMap.put("c",4);
       hashMap.put("b",2);
       System.out.println(hashMap);
       //修改
       hashMap.put("a",11);
       System.out.println(hashMap);
       //删除
       Object a = hashMap.remove("a");
       System.out.println(a);
       Object d = hashMap.remove("d");
       //删除数据不存在
       System.out.println(d);
       System.out.println(hashMap);
       //map大小
       System.out.println(hashMap.size());
       //是否为空
       System.out.println(hashMap.isEmpty());
       //是否包含指定的key
       System.out.println(hashMap.containsKey("b"));
       //是否包含指定的value
       System.out.println(hashMap.containsValue(2));
       //返回所要key的set集合
       Set<Object> keySet = hashMap.keySet();
       System.out.println("所有的key");
       for(Object k:keySet)
       {
           System.out.println(k);
       }
       System.out.println("所有的value");
       //返回所要的vaule
       Collection<Object> values = hashMap.values();
       for(Object o:values)
       {
           System.out.println(o);
       }
       System.out.println("key-value");
       //获取所有的key-value
       //方式一
       Set<Map.Entry<Object, Object>> entries = hashMap.entrySet();
       Iterator<Map.Entry<Object, Object>> iterator = entries.iterator();
       while(iterator.hasNext())
       {
           Map.Entry<Object, Object> next = iterator.next();
           System.out.println(next.getKey()+"----->"+next.getValue());
       }
       //方式二
       for(Object o:keySet)
       {
           System.out.println(o+"-------------->>>"+hashMap.get(o));
       }
   }
   @Test
    public void text9()
   {
       TreeMap treeMap = new TreeMap<>();
       treeMap.put(new Person(1,"shangsan"),70);
       treeMap.put(new Person(3,"lisi"),60);
       treeMap.put(new Person(1,"wangwu"),80);
       treeMap.put(new Person(2,"cb"),66);
//       treeMap.put("1",70);
//       treeMap.put("2",60);
       Set set = treeMap.keySet();
       Iterator iterator = set.iterator();
       while (iterator.hasNext())
       {
           Object next = iterator.next();
           System.out.println(next+"---->"+treeMap.get(next));
       }
   }

   @Test
   public void text10()
   {
       Comparator<Object> objectComparator = new Comparator(

       ) {
           @Override
           public int compare(Object o1, Object o2) {
               if(o1 instanceof Person && o2 instanceof Person)
               {
                   Person p1=(Person) o1;
                   Person p2=(Person) o2;
                   if(!p1.getName().equals(p2.getName()))
                   return p1.getName().compareTo(p2.getName());
                   else
                       return p1.getId()-p2.getId();
               }
               return 0;
           }

       };
       TreeMap treeMap = new TreeMap<>(objectComparator);
       treeMap.put(new Person(1,"shangsan"),70);
       treeMap.put(new Person(3,"lisi"),60);
       treeMap.put(new Person(1,"wangwu"),80);
       treeMap.put(new Person(2,"lisi"),66);
//       treeMap.put("1",70);
//       treeMap.put("2",60);
       Set set = treeMap.keySet();
       Iterator iterator = set.iterator();
       while (iterator.hasNext())
       {
           Object next = iterator.next();
           System.out.println(next+"---->"+treeMap.get(next));
       }

   }



}
