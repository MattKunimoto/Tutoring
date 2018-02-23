# card.py -- "Card" class file
# Matthew Kunimoto

class Card:

	suites = {'d':"Diamonds", "c":"Clubs", 'h':"Hearts", 's':"Spades"}
	ranks = {1:"Ace", 2:"Two", 3:"Three", 4:"Four", 5:"Five", 6:"Six", 7:"Seven", 8:"Eight", 9:"Nine", 10:"Ten", 11:"Jack", 12:"Queen", 13:"King"}
	values = {1:1, 2:2, 3:3, 4:4, 5:5, 6:6, 7:7, 8:8, 9:9, 10:10, 11:10, 12:10, 13:10}

	def __init__(self, rank, suite):
		self.rank = rank;
		self.suite = suite;

	def __repr__(self):
		return self.ranks[self.rank] + " of " + self.suite

#############################################################################
	@property									# "rank" private property
	def rank(self):
		return self._rank

	@rank.setter
	def rank(self, value):			# can add error checking (only accept values 1-13)
		self._rank = value

#############################################################################
	@property									# "suite" private property
	def suite(self):
		return self._suite

	@suite.setter
	def suite(self, value):			# can add error checking (only accept values in suite dictionary)
		self._suite = self.suites[value]

#############################################################################
	@property									# "value" private property
	def value(self):
		return self.values[self.rank]
