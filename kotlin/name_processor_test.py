import unittest
from name_processor import *

class NameProcessorTest(unittest.TestCase):
  def test_canary(self):
    self.assertTrue(True)
  
  def test_average_number_of_letters_empty_list(self):
    self.assertEqual(0.0, average_number_of_letters([]))

  def test_average_number_of_letters_one_name(self):
    self.assertEqual(3.0, average_number_of_letters(["Bob"]))

  def test_average_number_of_letters_two_names_same_length(self):
    self.assertEqual(3.0, average_number_of_letters(["Bob", "Kat"]))

  def test_average_number_of_letters_two_names_diff_length(self):
    self.assertEqual(3.5, average_number_of_letters(["Bob", "Mary"]))
  
  def test_average_num_letters_three_names_diff_length(self):
    self.assertEqual(4.0, average_number_of_letters(["Bob", "Mary", "Frank"]))
  
  def test_group_names_first_letter_empty_list(self):
    self.assertEqual({}, group_by_first_letter([]))

  def test_group_names_first_letter_one_name(self):
     self.assertEqual({ "B": ["Bob"] }, group_by_first_letter(["Bob"]))
  
  def test_group_names_first_letter_two_names_same_initial(self):
    self.assertEqual({ "B": ["Bob", "Barbara"] }, group_by_first_letter(["Bob", "Barbara"]))
  
  def test_group_names_first_letter_two_names_diff_initial(self):
    self.assertEqual({ "B": ["Bob"], "M": ["Mary"] }, group_by_first_letter(["Bob", "Mary"]))
  
  def test_group_names_first_letter_two_names_same_one_diff_initial(self):
    self.assertEqual({ "B": ["Bob", "Barbara"], "M": ["Mary"] }, group_by_first_letter(["Bob", "Mary", "Barbara"]))

  def test_num_names_by_first_letter_empty_list(self):
    self.assertEqual({}, num_names_by_first_letter([]))
  
  def test_num_names_by_first_letter_one_name(self):
    self.assertEqual({"B": 1}, num_names_by_first_letter(["Bob"]))
  
  def test_num_names_by_first_letter_two_names_same_initial(self):
    self.assertEqual({"B": 2}, num_names_by_first_letter(["Bob", "Barbara"]))
  
  def test_num_names_by_first_letter_two_names_diff_initial(self):
    self.assertEqual({"B": 1, "M": 1}, num_names_by_first_letter(["Bob", "Mary"]))
  
  def test_num_names_by_first_letter_two_names_same_one_diff_initial(self):
    self.assertEqual({"B": 2, "M": 1}, num_names_by_first_letter(["Bob", "Mary", "Barbara"]))

  def test_average_number_of_letters_immutable_empty_list(self):
    self.assertEqual(0.0, average_number_of_letters_immutable([]))

  def test_average_number_of_letters_immutable_one_name(self):
    self.assertEqual(3.0, average_number_of_letters_immutable(["Bob"]))
  
  def test_average_number_of_letters_immutable_two_names_same_length(self):
    self.assertEqual(3.0, average_number_of_letters_immutable(["Bob", "Kat"]))

  def test_average_number_of_letters_immutable_two_names_diff_length(self):
    self.assertEqual(3.5, average_number_of_letters_immutable(["Bob", "Mary"]))
  
  def test_average_num_letters_immutable_three_names_diff_length(self):
    self.assertEqual(4.0, average_number_of_letters_immutable(["Bob", "Mary", "Frank"]))
  
  def test_group_names_first_letter_immutable_empty_list(self):
    self.assertEqual({}, group_by_first_letter_immutable([]))

  def test_group_names_first_letter_immutable_one_name(self):
     self.assertEqual({ "B": ["Bob"] }, group_by_first_letter_immutable(["Bob"]))
    
  def test_group_names_first_letter_immutable_two_names_same_initial(self):
    self.assertEqual({ "B": ["Barbara", "Bob"] }, group_by_first_letter_immutable(["Bob", "Barbara"]))
  
  def test_group_names_first_letter_immutable_two_names_diff_initial(self):
    self.assertEqual({ "B": ["Bob"], "M": ["Mary"] }, group_by_first_letter_immutable(["Bob", "Mary"]))
  
  def test_group_names_first_letter_immutable_two_names_same_one_diff_initial(self):
    self.assertEqual({ "B": ["Barbara", "Bob"], "M": ["Mary"] }, group_by_first_letter_immutable(["Bob", "Mary", "Barbara"]))
  
  def test_num_names_by_first_letter_immutable_empty_list(self):
    self.assertEqual({}, num_names_by_first_letter_immutable([]))
  
  def test_num_names_by_first_letter_immutable_one_name(self):
    self.assertEqual({"B": 1}, num_names_by_first_letter_immutable(["Bob"]))
  
  def test_num_names_by_first_letter_immutable_two_names_same_initial(self):
    self.assertEqual({"B": 2}, num_names_by_first_letter_immutable(["Bob", "Barbara"]))
  
  def test_num_names_by_first_letter_immutable_two_names_diff_initial(self):
    self.assertEqual({"B": 1, "M": 1}, num_names_by_first_letter_immutable(["Bob", "Mary"]))
  
  def test_num_names_by_first_letter_immutable_two_names_same_one_diff_initial(self):
    self.assertEqual({"B": 2, "M": 1}, num_names_by_first_letter_immutable(["Bob", "Mary", "Barbara"]))