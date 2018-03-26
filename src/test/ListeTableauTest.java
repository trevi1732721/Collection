package test;

import liste.ListeTableau;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by trevi1732721 on 2018-03-26.
 */
class ListeTableauTest {
    ListeTableau<String> test;
    @org.junit.jupiter.api.BeforeEach

    void setUp() {
        test = new ListeTableau<String>();
        for(int i=0;i<3;i++){
            test.add("TEST "+ i);
        }
    }

    @org.junit.jupiter.api.Test
    void add() {
        test.add("essaie 1");
        test.add("essaie 2");
        assertEquals("TEST 0",test.get(0));
        assertEquals("TEST 1",test.get(1));
        assertEquals("TEST 2",test.get(2));
        assertEquals("essaie 1",test.get(3));
        assertEquals("essaie 2",test.get(4));
    }

    @org.junit.jupiter.api.Test
    void add1() {
        test.add(0,"essaie 1");
        test.add(2,"essaie 2");
        test.add(5,"essaie 3");

        assertEquals("essaie 1",test.get(0));
        assertEquals("TEST 0",test.get(1));
        assertEquals("essaie 2",test.get(2));
        assertEquals("TEST 1",test.get(3));
        assertEquals("TEST 2",test.get(4));
        assertEquals("essaie 3",test.get(5));
    }

    @org.junit.jupiter.api.Test
    void set() {
        test.set(1,"essaie 1");

        assertEquals("TEST 0",test.get(0));
        assertEquals("essaie 1",test.get(1));
    }

    @org.junit.jupiter.api.Test
    void get() {
    }

    @org.junit.jupiter.api.Test
    void remove() {
    }

    @org.junit.jupiter.api.Test
    void clear() {
    }

    @org.junit.jupiter.api.Test
    void size() {
    }

    @org.junit.jupiter.api.Test
    void tooSmall() {
    }

}