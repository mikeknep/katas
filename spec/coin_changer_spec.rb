require 'spec_helper'

describe CoinChanger do
  tests = [
    [1, [1]],
    [2, [1,1]],
    [3, [1,1,1]],
    [4, [1,1,1,1]],
    [5, [5]],
    [6, [5,1]],
    [8, [5,1,1,1]],
    [10, [10]],
    [15, [10,5]],
    [23, [10,10,1,1,1]],
    [25, [25]],
    [51, [25,25,1]],
    [65, [25,25,10,5]],
    [99, [25,25,25,10,10,1,1,1,1]]
  ]

  tests.each do |total, change|
    it "returns #{change} for #{total}" do
      expect(CoinChanger.make_change_for(total)).to eq(change)
    end
  end
end
