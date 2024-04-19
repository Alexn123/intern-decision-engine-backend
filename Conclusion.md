# Conclusion of Ticket-101 - Backend

---

Problems outside of scope for the Take Home Task will not be written in here such as the use of Git.

## Done Well

---

- A working application was build by the guidelines of the Ticket

- The test cases provided covered a wide range of cases.

- The usage of DecisionEngineConstants is great, making the code more manageable.

-

## Places For Improvement // Problems

---

- The Exceptions messages are unambiguous, meaning that for multiple different reasons, the applications gives "no valid loan found" message, which might leave the user confused.
- The main problem is that the credit score algorithm was not implemented. While the intern was very clever in rearranging the algorithm from

> Credit Score = (credit modifier / loan amount) * loan period

to using it to find the maximum loan amount by rearranging the equation to

> loan amount = credit modifier * loan period

The intern did however forget to implement the credit score algorithm, like the Ticket-101 instructed. (Currently however credit score does not have any use.)

# Fixes

---

- Wrote the Credit Score calculation algorithm, as per the task, although it currently has no use.

# Ticket-102

---

- Implemented ticket-102. Added files: exceptions - InvalidAgeException; service - DecisionEngineAgeRestrictions