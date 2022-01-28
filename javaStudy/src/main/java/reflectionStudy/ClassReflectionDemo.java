package reflectionStudy;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.Class;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ClassReflectionDemo {
	public static void main(String[] args) throws
		ClassNotFoundException,
		NoSuchMethodException,
		InvocationTargetException,
		IllegalAccessException, NoSuchFieldException {

		// Class aClass = Person.class;
		// String className = aClass.getName();
		// String simpleClassName = aClass.getSimpleName();

		//String className = "reflection.Person";
		//Class aClass = Class.forName(className);

		// Class aClass = Person.class;
		// int modifiers = aClass.getModifiers();
		//
		// Modifier.isAbstract(modifiers);
		// Modifier.isFinal(modifiers);
		// Modifier.isInterface(modifiers);
		// Modifier.isNative(modifiers);
		// Modifier.isPrivate(modifiers);
		// Modifier.isProtected(modifiers);
		// Modifier.isPublic(modifiers);
		// Modifier.isStatic(modifiers);
		// Modifier.isStrict(modifiers);
		// Modifier.isSynchronized(modifiers);
		// Modifier.isTransient(modifiers);
		// Modifier.isVolatile(modifiers);

		// Class aClass = Person.class;
		// Package aPackage = aClass.getPackage();

		// Class aClass = Person.class;
		// Class superClass = aClass.getSuperclass();

		// Class aClass = Person.class;
		// Class[] interfaces = aClass.getInterfaces();

		// Class aClass = Person.class;
		// Constructor[] constructors = aClass.getConstructors();
		fieldReflection();
	}

	public static void methodReflection() throws
		NoSuchMethodException,
		InvocationTargetException,
		IllegalAccessException {

		// Class aClass = Person.class;
		// Method[] methods = aClass.getMethods();

		// Class aClass = Person.class;
		// Method method = aClass.getMethod("setName", new Class[]{String.class});

		// Class aClass = Person.class;
		// Method method = aClass.getMethod("getName", null);


		Class aClass = Person.class;

		// Method method = aClass.getMethod("setName", new Class[]{String.class});
		// Class[] parameterTypes = method.getParameterTypes();

		Person person = new Person("ted",5);
		Method method = aClass.getMethod("getName", null);
		Method method2 = aClass.getMethod("setAge", int.class);
		Method method3 = aClass.getMethod("getAge");

		String returnName = (String)method.invoke(person); // 이름 조회
		method2.invoke(person,13);				   // 나이 수정
		Integer returnAge = (Integer)method3.invoke(person);  // 나이 조회

		System.out.println("이름:"+returnName + ", 나이:"+returnAge);
	}

	public static void fieldReflection() throws
		InvocationTargetException,
		IllegalAccessException, NoSuchFieldException {
		// Class aClass = Person.class;
		// Field[] fields = aClass.getFields();
		Class aClass = Person.class;
		Field field = aClass.getField("age");

		Person person = new Person("ted",5);
		Object value = field.get(person);
		field.set(person, value);

		System.out.println(field.getName());
	}
}
