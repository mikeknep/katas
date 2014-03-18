require 'spec_helper'

describe PrimeFactors do
  tests = [
    [1, []],
    [2, [2]],
    [3, [3]],
    [4, [2,2]],
    [5, [5]],
    [6, [2,3]],
    [7, [7]],
    [8, [2,2,2]],
    [9, [3,3]],
    [10, [2,5]],
    [18, [2,3,3]],
    [5*7*11*17*19, [5,7,11,17,19]],
    [3**4*13**3, [3,3,3,3,13,13,13]]
  ]

  tests.each do |integer, factors|
    it "returns #{factors} for #{integer}" do
      expect(PrimeFactors.for(integer)).to eq(factors)
    end
  end
end
