require "test/unit"
require_relative "../src/name_processor"

class NameProcessorTest < Test::Unit::TestCase
  def test_canary
    assert true
  end

  def test_average_num_letters_empty_list
    assert_equal 0.0, average_number_of_letters([])
  end

  def test_average_num_letters_one_name
    assert_equal 3.0, average_number_of_letters(["Bob"])
  end

  def test_average_num_letters_two_names_same_length
    assert_equal 3.0, average_number_of_letters(["Bob", "Kat"])
  end

  def test_average_num_letters_two_names_diff_length
    assert_equal 3.5, average_number_of_letters(["Bob", "Mary"])
  end

  def test_average_num_letters_three_names_diff_length
    assert_equal 4.0, average_number_of_letters(["Bob", "Mary", "Frank"])
  end

  def test_group_names_first_letter_empty_list
    assert_equal ({}), group_by_first_letter([])
  end

  def test_group_names_first_letter_one_name
    assert_equal ({ "B" => ["Bob"] }), group_by_first_letter(["Bob"])
  end

  def test_group_names_first_letter_two_names_same_initial
    assert_equal ({ "B" => ["Bob", "Barbara"] }), group_by_first_letter(["Bob", "Barbara"])
  end

  def test_group_names_first_letter_two_names_diff_initial
    assert_equal ({ "B" => ["Bob"], 'M' => ["Mary"] }), group_by_first_letter(["Bob", "Mary"])
  end

  def test_group_names_first_letter_two_names_same_one_diff_initial()
    assert_equal ({ "B" => ["Bob", "Barbara"], "M" => ["Mary"] }), group_by_first_letter(["Bob", "Mary", "Barbara"])
  end

  def test_num_names_by_first_letter_empty_list
    assert_equal ({}), num_names_by_first_letter([])
  end

  def test_num_names_by_first_letter_one_name
    assert_equal ({ "B" => 1 }), num_names_by_first_letter(["Bob"])
  end

  def test_num_names_by_first_letter_two_names_same_initial
    assert_equal ({ "B" => 2 }), num_names_by_first_letter(["Bob", "Barbara"])
  end

  def test_num_names_by_first_letter_two_names_diff_initial
    assert_equal ({ "B" => 1, "M" => 1 }), num_names_by_first_letter(["Bob", "Mary"])
  end

  def test_num_names_by_first_letter_two_names_same_one_diff_initial
    assert_equal ({ "B" => 2, "M" => 1 }), num_names_by_first_letter(["Bob", "Mary", "Barbara"])
  end

  def test_average_num_letters_immutable_empty_list
    assert_equal 0.0, average_number_of_letters_immutable([])
  end

  def test_average_num_letters_immutable_one_name
    assert_equal 3.0, average_number_of_letters_immutable(["Bob"])
  end

  def test_average_num_letters_immutable_two_names_same_length
    assert_equal 3.0, average_number_of_letters_immutable(["Bob", "Kat"])
  end

  def test_average_num_letters_immutable_two_names_diff_length
    assert_equal 3.5, average_number_of_letters_immutable(["Bob", "Mary"])
  end

  def test_average_num_letters_immutable_three_names_diff_length()
    assert_equal 4.0, average_number_of_letters_immutable(["Bob", "Mary", "Frank"])
  end

  def test_group_names_first_letter_immutable_empty_list
    assert_equal ({}), group_by_first_letter_immutable([])
  end

  def test_group_names_first_letter_immutable_one_name
    assert_equal ({ "B" => ["Bob"] }), group_by_first_letter_immutable(["Bob"])
  end

  def test_group_names_first_letter_immutable_two_names_same_initial
    assert_equal ({ "B" => ["Bob", "Barbara"] }), group_by_first_letter_immutable(["Bob", "Barbara"])
  end

  def test_group_names_first_letter_immutable_two_names_diff_initial
    assert_equal ({ "B" => ["Bob"], 'M' => ["Mary"] }), group_by_first_letter_immutable(["Bob", "Mary"])
  end

  def test_group_names_first_letter_immutable_two_names_same_one_diff_initial
    assert_equal ({ "B" => ["Bob", "Barbara"], "M" => ["Mary"] }), group_by_first_letter_immutable(["Bob", "Mary", "Barbara"])
  end

  def test_num_names_by_first_letter_immutable_empty_list
    assert_equal ({}), num_names_by_first_letter_immutable([])
  end

  def test_num_names_by_first_letter_immutable_one_name
    assert_equal ({ "B" => 1 }), num_names_by_first_letter_immutable(["Bob"])
  end

  def test_num_names_by_first_letter_immutable_two_names_same_initial
    assert_equal ({ "B" => 2 }), num_names_by_first_letter_immutable(["Bob", "Barbara"])
  end

  def test_num_names_by_first_letter_immutable_two_names_diff_initial
    assert_equal ({ "B" => 1, "M" => 1 }), num_names_by_first_letter_immutable(["Bob", "Mary"])
  end

  def test_num_names_by_first_letter_immutable_two_names_same_one_diff_initial
    assert_equal ({ "B" => 2, "M" => 1 }), num_names_by_first_letter_immutable(["Bob", "Mary", "Barbara"])
  end
end
