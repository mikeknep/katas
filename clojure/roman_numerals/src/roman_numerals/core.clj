(ns roman_numerals.core)


(defn largest_arabic_key [translator]
  (last (sort (keys translator))))

(defn build_roman_string [roman translator]
  (apply str [roman (get translator (largest_arabic_key translator))]))


(defn number_to_roman [arabic]
  (loop [arabic       arabic
         roman        ""
         translator   {1000 "M" 900 "CM" 500 "D" 400 "CD" 100 "C" 90 "XC" 50 "L" 40 "XL" 10 "X" 9 "IX" 5 "V" 4 "IV" 1 "I"}]
    (if (= 0 arabic)
      roman
      (if (>= arabic (largest_arabic_key translator))
        (recur (- arabic (largest_arabic_key translator)) (build_roman_string roman translator) translator)
        (recur arabic roman (dissoc translator (largest_arabic_key translator)))))))
