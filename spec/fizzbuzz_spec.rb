require 'spec_helper'

describe Fizzbuzz do
  tests = [
    [1, '1'],
    [2, '1 2'],
    [3, '1 2 fizz'],
    [4, '1 2 fizz 4'],
    [5, '1 2 fizz 4 buzz'],
    [6, '1 2 fizz 4 buzz fizz'],
    [15,'1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz']
  ]

  tests.each do |input, string_output|
    it "returns #{string_output} for #{input}" do
      expect(Fizzbuzz.up_to(input)).to eq(string_output)
    end
  end
end
