package com.max.behavioral.memento;

import java.io.*;

// Everyday example of the Memento design pattern using Java Serialize
public class MementoEverydayDemo {

    private static EmployeeSerializable deserialize() {
        EmployeeSerializable employeeSerializable = null;
        try (FileInputStream fileInputStream = new FileInputStream("employeeSerializable.ser"); ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);) {
            employeeSerializable = (EmployeeSerializable) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return employeeSerializable;
    }

    private static void serialize(EmployeeSerializable employeeSerializable) {
        File outputFile = new File("employeeSerializable.ser");
        try (FileOutputStream fileOutputStream = new FileOutputStream(outputFile); ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);) {
            objectOutputStream.writeObject(employeeSerializable);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        EmployeeSerializable employeeSerializable = new EmployeeSerializable();
        employeeSerializable.setName("John Smith");
        employeeSerializable.setAddress("1234 Main Street");
        employeeSerializable.setPhone("123-456-7899");

        serialize(employeeSerializable);

        EmployeeSerializable newEmployeeSerializable = deserialize();

        System.out.println("New EmployeeSerializable: " + newEmployeeSerializable);
    }
}
