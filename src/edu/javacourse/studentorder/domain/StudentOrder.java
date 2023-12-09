package edu.javacourse.studentorder.domain;

import edu.javacourse.studentorder.domain.other.Adult;

public class StudentOrder {
        private long studentOrderID;
        private Adult husbant;
        private  Adult wife;
        private  Child child;

        public long getStudentOrderID() {
            return studentOrderID;
        }

        public void setStudentOrderID(long studentOrderID) {
            this.studentOrderID = studentOrderID;
        }

        public Adult getHusbant() {
            return husbant;
        }

        public void setHusbant(Adult husbant) {
            this.husbant = husbant;
        }

        public Adult getWife() {
            return wife;
        }

        public void setWife(Adult wife) {
            this.wife = wife;
        }

        public Child getChild() {
            return child;
        }

        public void setChild(Child child) {
            this.child = child;
        }
    }
