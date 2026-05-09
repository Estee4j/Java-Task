def validate_email(email):

    if len(email) >= 8:

        if "@" in email:
            return "valid email"

            return True

    return False
