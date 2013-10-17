(ns Calculator-Kata-Clojure.core)
(use '[clojure.string :only (join split)])

(defn add-string [input]
  (add-numbers (as-number-sequence input)))

(defn add-numbers [numbers]
  (cond (= (count numbers) 0) 0
        (= (count numbers) 1)  (first numbers)
        :else (+ (first numbers) (add-numbers (rest numbers)))))

(defn as-number-sequence [input]
  (if (= (count input) 0) [0]
        (map read-string (split input #","))))
