package com.codegnan.CurdOperationusingArrays;

import java.util.Scanner;

interface CrudOperations {
    void insert(int element);
    void update(int index, int element);
    void delete(int index);
    void display();
}

public class ArrayOperations implements CrudOperations {
    private int arr[];
    private int size;
    private int capacity;

    public ArrayOperations(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.size = 0;
    }

    @Override
    public void insert(int element) {
        if (size < capacity) {
            arr[size] = element;
            System.out.println("Inserted: " + element + " at index " + size);
            size++;
        } else {
            System.out.println("Array is full. Cannot insert.");
        }
    }

    @Override
    public void update(int index, int element) {
        if (index >= 0 && index < size) {
            arr[index] = element;
            System.out.println("Updated index " + index + " to " + element);
        } else {
            System.out.println("Invalid index. Cannot update.");
        }
    }

    @Override
    public void delete(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[size - 1] = 0;// default value (o"ZERO")
            size--;
            System.out.println("Deleted element at index " + index);
        } else {
            System.out.println("Invalid index. Cannot delete.");
        }
    }

    @Override
    public void display() {
        System.out.println("Array elements:");
        for (int i = 0; i < capacity; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayOperations ops = null;
        while (true) {
            System.out.println("Choose an operation: 1) Create Array:  2) Insert: 3) Update:  4) Delete:  5) Display:  6) Exit(out): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the capacity of the array:");
                    int capacity = scanner.nextInt();
                    ops = new ArrayOperations(capacity);
                    System.out.println("Array created with capacity: " + capacity);
                    break;
                case 2:
                    if (ops != null) {
                        System.out.println("Enter the element to insert:");
                        int elementToInsert = scanner.nextInt();
                        ops.insert(elementToInsert);
                    } else {
                        System.out.println("Array not created. Please create the array first.");
                    }
                    break;
                case 3:
                    if (ops != null) {
                        System.out.println("Enter the index to update:");
                        int indexToUpdate = scanner.nextInt();
                        System.out.println("Enter the new element:");
                        int elementToUpdate = scanner.nextInt();
                        ops.update(indexToUpdate, elementToUpdate);
                    } else {
                        System.out.println("Array not created. Please create the array first.");
                    }
                    break;
                case 4:
                    if (ops != null) {
                        System.out.println("Enter the index to delete:");
                        int indexToDelete = scanner.nextInt();
                        ops.delete(indexToDelete);
                    } else {
                        System.out.println("Array not created. Please create the array first.");
                    }
                    break;
                case 5:
                    if (ops != null) {
                        ops.display();
                    } else {
                        System.out.println("Array not created, please create the array first.");
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
