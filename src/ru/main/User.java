package ru.main;


import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class User {

    public static void main(String[] args) throws Exception {
        Class<Box> boxClass = Box.class;

        Box boxObject = new Box(10, "TestName", 20);

//        Field[] fields = boxClass.getDeclaredFields();
//
//        for (Field field : fields) {
//            System.out.println("---------------------------------------");
//            System.out.println(field.getType());
//            System.out.println(field.getName());
//            System.out.println(field.getModifiers());
//
//        }




//        Field fieldName = boxClass.getField("name");
//        System.out.println(fieldName);
//
//        System.out.println(boxObject.name);
//        fieldName.set(boxObject, "Java");
//        System.out.println(boxObject.name);
//
//

//        Field fieldId = boxClass.getDeclaredField("Id");
//        System.out.println(fieldId);
//
//        fieldId.setAccessible(true);
//        fieldId.set(boxObject, 100);
//        System.out.println(fieldId.get(boxObject));




//        Field staticField = boxClass.getDeclaredField("staticField");
//        System.out.println(staticField);
//
//        staticField.setAccessible(true);
//        System.out.println(staticField.get(boxClass));
//        staticField.set(boxClass,10);
//        System.out.println(staticField.get(boxClass));
//


//        Method[] methods = boxClass.getDeclaredMethods();
//
//        for (Method method : methods) {
//            System.out.println(method.getName());
//        }




        Method publicMethod = boxClass.getDeclaredMethod("publicMethod", int.class);
        publicMethod.invoke(boxObject, 10);

        Constructor<Box> constructor = boxClass.getConstructor(Integer.class, String.class, int.class);
        Box customCreateBox = constructor.newInstance(40, "CustomCreateBox", 50);

        System.out.println(customCreateBox.name);
        System.out.println(customCreateBox.size);
    }


}
