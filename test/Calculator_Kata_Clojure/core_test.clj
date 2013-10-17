(ns Calculator-Kata-Clojure.core-test
  (:use clojure.test
        Calculator-Kata-Clojure.core))

(deftest calculator-kata-spec

  (testing "adds zero numbers"
           (is (= (add-string "") 0)))

  (testing "adds one number"
           (is (= (add-string "22") 22)))

  (testing "adds two numbers"
           (is (= (add-string "22,33") 55)))

  (testing "adds more than two numbers"
           (is (= (add-string "22,33,100") 155)))

  )

(run-tests)
