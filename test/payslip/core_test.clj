(ns payslip.core-test
  (:require [clojure.test :refer :all]
            [payslip.core :refer :all]))

(deftest income-tax-calc
  (testing "income tax calculated correctly"
    (is (= 922.0 (income-tax 3572 60050 37000 0.325)))))

(deftest super-calc
  (testing "superannuation calculated correctly"
    (is (= 450.0 (super 5004 9)))))
