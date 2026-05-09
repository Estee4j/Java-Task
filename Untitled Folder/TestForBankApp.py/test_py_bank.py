from unittest import TestCase

import py_bank

class TestValidateEmail (TestCase):

    def test_that_validate_email_function_exists(self):
        py_bank.validate_email("esther.okagwa@.com")

    def test_that_valid_email_has_a_minimum_of_8_characters(self):
        is_valid = py_bank.validate_email("esther.okagwa@.com")
        self.assertTrue(is_valid)
#
    def test_that_invalid_email_has_a_minimum_of_8_characters_return_false(self):
        is_invalid = py_bank.validate_email("esther")
        self.assertFalse(is_invalid)

    def test_that_valid_email_contain_special_character(self):
        actual = py_bank.validate_email("esther.okagwa@.com")
        expected = "valid email"
        self.assertEqual(actual, expected)

