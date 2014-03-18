module PrimeFactors
  def self.for(integer)
    factors = Array.new
    divisor = 2

    while integer > 1
      factors << divisor and integer /= divisor while integer % divisor == 0
      divisor += 1
    end

    factors
  end
end
