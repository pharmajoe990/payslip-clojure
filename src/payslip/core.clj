(ns payslip.core)


(defn gross-income
  [salary]
  (quot salary 12))
(gross-income 60050)

(defn income-tax
  [base-rate, salary, bracket-limit, rate]
  (Math/ceil (/ (+ base-rate (* rate (- salary bracket-limit))) 12)))

(defn net-income
  [gross-income, income-tax]
  (- gross-income income-tax))

(defn super
  [gross-income, rate]
  (Math/floor (* gross-income (* rate 0.01))))
