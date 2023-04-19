package com.bldea.crorepathiApp.package1;

import java.util.Scanner;

public class Question {
	static String result;
	static String result2;
	static int count_life_line = 3;
	static int aud_phn = 1;
	static int cnt_50_50 = 1;
	static int skip_cnt=1;
	static Scanner sc = new Scanner(System.in);
public static boolean fetchQuestion1(String name) throws Exception {
			System.out.println("1. Who is the founder of Java?");
			System.out.println("a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n"
					+ "e) life line");
			result = sc.next();
			if (result.equalsIgnoreCase("d")) {
				Candidate.setAmount(1000);
				return true;
			} else if (result.equalsIgnoreCase("e")) {
				if (count_life_line > 0) {
					count_life_line--;
					System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result2 = sc.next();
					if (result2.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(1000);
							System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								Candidate.setAmount(1000);
								return true;
							} else {
								return false;
							}
						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50\n" + "c. skip");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(1000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50 -- (not available) \n" + "c. skip");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("c")) {
										if(skip_cnt!=0) {
											Candidate.setAmount(1000);
											return true;
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println(
													"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(1000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("c")) {
								if (skip_cnt != 0) {
									skip_cnt = 0;
									Candidate.setAmount(1000);
									return true;
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
											+ "b. 50-50 \n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (cnt_50_50 != 0) {
											cnt_50_50 = 0;
											System.out.println("Select the options");
											System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(1000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println(
													"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(1000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}
					else if (result2.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								Candidate.setAmount(1000);
								return true;
							} else {
								return false;
							}

						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(1000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(1000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50 -- (not available) \n" + "c. skip");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("c")) {
										if(skip_cnt!=0) {
											Candidate.setAmount(1000);
											return true;
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println(
													"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(1000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("c")) {
								if (skip_cnt != 0) {
									skip_cnt = 0;
									Candidate.setAmount(1000);
									return true;
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
											+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (aud_phn != 0) {
											aud_phn = 0;
											Thread.sleep(1000);
											System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
											System.out.println("Select the option");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(1000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println(
													"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(1000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}

					else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(1000);
							return true;
						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(1000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(1000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50  \n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("b")) {
										if (cnt_50_50 != 0) {
											cnt_50_50 = 0;
											System.out.println("Select the options");
											System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(1000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println(
													"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(1000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(1000);
										return true;
									} else {
										return false;
									}
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
											+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (aud_phn != 0) {
											aud_phn = 0;
											Thread.sleep(1000);
											System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
											System.out.println("Select the option");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(1000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println(
													"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(1000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}
				}
				//changes in line 122
				else {
					System.out.println("You have no life line left. Please select an option:");
					System.out.println(
							"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
					result = sc.next();
					if (result.equalsIgnoreCase("d")) {
						Candidate.setAmount(1000);
						return true;
					}
				}
			}
			return false;
		}	
public static boolean fetchQuestion2(String name) throws Exception{
	System.out.println("2. Which of the following corresponds to'ek bataa do'?");
	System.out.println("a) Pura\n"+
			"b) Sawa\n"+
			"c) Pauna\n"+
			"d) Adha\n"+
			"e)life line");
result = sc.next();
if (result.equalsIgnoreCase("d")) {
	Candidate.setAmount(2000);
	return true;
} else if (result.equalsIgnoreCase("e")) {
	if (count_life_line > 0) {
		count_life_line--;
		System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
		System.out.println("Select the life line:");
		String result2 = sc.next();
		if (result2.equalsIgnoreCase("a")) {
			if (aud_phn != 0) {
				aud_phn = 0;
				Thread.sleep(1000);
				System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
				System.out.println("Select the option");
				result = sc.next();
				if (result.equalsIgnoreCase("d")) {
					Candidate.setAmount(2000);
					return true;
				} else {
					return false;
				}
			} else {
				//
				System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
						+ "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result3 = sc.next();
				if (result3.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a)Pura\n"+"d) Adha");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(2000);
							return true;
						} else {
							return false;
						}
					}
					else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result4 = sc.next();
						if(result4.equalsIgnoreCase("c")) {
							if(skip_cnt!=0) {
								Candidate.setAmount(2000);
								return true;
							}
							else {
								System.out.println("You have no life line left. Please select an option:");
								System.out.println("a) Pura\n"+
										"b) Sawa\n"+
										"c) Pauna\n"+
										"d) Adha\n");								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(2000);
									return true;
								}
								else
									return false;
							}
						}
						//--- need code intervention
					}
				} else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(2000);
						return true;
					}
					else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
								+ "b. 50-50 \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result4 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a)Pura\n"+"d) Adha");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("You have no life line left. Please select an option:");
								System.out.println("a) Pura\n"+
										"b) Sawa\n"+
										"c) Pauna\n"+
										"d) Adha\n");								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(2000);
									return true;
								}
								else
									return false;
							}
						}
					}
				}
			}
		}
		else if (result2.equalsIgnoreCase("b")) {
			if (cnt_50_50 != 0) {
				cnt_50_50 = 0;
				System.out.println("Select the options");
				System.out.println("a)Pura\n"+"d) Adha");
				result = sc.next();
				if (result.equalsIgnoreCase("d")) {
					Candidate.setAmount(2000);
					return true;
				} else {
					return false;
				}

			} else {
				//
				System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
						+ "b. 50-50 -- (not available) \n" + "c. skip");
				System.out.println("Select the life line:");
				String result3 = sc.next();
				if (result3.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(1000);
						System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(2000);
							return true;
						} else {
							return false;
						}
					}
					else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result4 = sc.next();
						if(result4.equalsIgnoreCase("c")) {
							if(skip_cnt!=0) {
								Candidate.setAmount(2000);
								return true;
							}
							else {
								System.out.println("You have no life line left. Please select an option:");
								System.out.println("a) Pura\n"+
										"b) Sawa\n"+
										"c) Pauna\n"+
										"d) Adha\n");								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(2000);
									return true;
								}
								else
									return false;
							}
						}
						//--- need code intervention
					}
				} else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(2000);
						return true;
					}
					else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
								+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result4 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(1000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("You have no life line left. Please select an option:");
								System.out.println("a) Pura\n"+
										"b) Sawa\n"+
										"c) Pauna\n"+
										"d) Adha\n");								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(2000);
									return true;
								}
								else
									return false;
							}
						}
					}
				}
			}
		}

		else if (result2.equalsIgnoreCase("c")) {
			if (skip_cnt != 0) {
				skip_cnt = 0;
				Candidate.setAmount(2000);
				return true;
			} else {
				//
				System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
						+ "b. 50-50  \n" + "c. skip -- (not available)");
				System.out.println("Select the life line:");
				String result3 = sc.next();
				if (result3.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(1000);
						System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(2000);
							return true;
						} else {
							return false;
						}
					}
					else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result4 = sc.next();
						if(result4.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a)Pura\n"+"d) Adha");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("You have no life line left. Please select an option:");
								System.out.println("a) Pura\n"+
										"b) Sawa\n"+
										"c) Pauna\n"+
										"d) Adha\n");								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(2000);
									return true;
								}
								else
									return false;
							}
						}
						//--- need code intervention
					}
				} else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a)Pura\n"+"d) Adha");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(2000);
							return true;
						} else {
							return false;
						}
					}
					else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
								+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result4 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(1000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("You have no life line left. Please select an option:");
								System.out.println("a) Pura\n"+
										"b) Sawa\n"+
										"c) Pauna\n"+
										"d) Adha\n");								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(2000);
									return true;
								}
								else
									return false;
							}
						}
					}
				}
			}
		}
	}
	//changes in line 122
	else {
		System.out.println("You have no life line left. Please select an option:");
		System.out.println("a) Pura\n"+
				"b) Sawa\n"+
				"c) Pauna\n"+
				"d) Adha\n");		result = sc.next();
		if (result.equalsIgnoreCase("d")) {
			Candidate.setAmount(2000);
			return true;
		}
	}
}
return false;
}	
public static boolean fetchQuestion3(String name) throws Exception {
	System.out.println("3. Which of the following gods is also known as 'Gauri Nandan'?");
	System.out.println("a) Agni\n"+
			"b) Indra\n"+
			"c) Hanuman\n"+
			"d) Ganesha\n"+
			"e)life line");
result = sc.next();
if (result.equalsIgnoreCase("d")) {
	Candidate.setAmount(5000);
	return true;
} else if (result.equalsIgnoreCase("e")) {
	if (count_life_line > 0) {
		count_life_line--;
		System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
		System.out.println("Select the life line:");
		String result2 = sc.next();
		if (result2.equalsIgnoreCase("a")) {
			if (aud_phn != 0) {
				aud_phn = 0;
				Thread.sleep(10000);
				System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
				System.out.println("Select the option");
				result = sc.next();
				if (result.equalsIgnoreCase("d")) {
					Candidate.setAmount(5000);
					return true;
				} else {
					return false;
				}
			} else {
				//
				System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
						+ "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result3 = sc.next();
				if (result3.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a) Agni\n"+
								"d) Ganesha\n");						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(5000);
							return true;
						} else {
							return false;
						}
					}
					else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result4 = sc.next();
						if(result4.equalsIgnoreCase("c")) {
							if(skip_cnt!=0) {
								Candidate.setAmount(5000);
								return true;
							}
							else {
								System.out.println("You have no life line left. Please select an option:");
								System.out.println("a) Agni\n"+
										"b) Indra\n"+
										"c) Hanuman\n"+
										"d) Ganesha\n");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(5000);
									return true;
								}
								else
									return false;
							}
						}
						//--- need code intervention
					}
				} else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(5000);
						return true;
					}
					else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
								+ "b. 50-50 \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result4 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) Agni\n"+
										"d) Ganesha\n");								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(5000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("You have no life line left. Please select an option:");
								System.out.println("a) Agni\n"+
										"b) Indra\n"+
										"c) Hanuman\n"+
										"d) Ganesha\n");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(5000);
									return true;
								}
								else
									return false;
							}
						}
					}
				}
			}
		}
		else if (result2.equalsIgnoreCase("b")) {
			if (cnt_50_50 != 0) {
				cnt_50_50 = 0;
				System.out.println("Select the options");
				System.out.println("a) Agni\n"+
						"d) Ganesha\n");				result = sc.next();
				if (result.equalsIgnoreCase("d")) {
					Candidate.setAmount(5000);
					return true;
				} else {
					return false;
				}

			} else {
				//
				System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
						+ "b. 50-50 -- (not available) \n" + "c. skip");
				System.out.println("Select the life line:");
				String result3 = sc.next();
				if (result3.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(5000);
							return true;
						} else {
							return false;
						}
					}
					else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result4 = sc.next();
						if(result4.equalsIgnoreCase("c")) {
							if(skip_cnt!=0) {
								Candidate.setAmount(5000);
								return true;
							}
							else {
								System.out.println("You have no life line left. Please select an option:");
								System.out.println("a) Agni\n"+
										"b) Indra\n"+
										"c) Hanuman\n"+
										"d) Ganesha\n");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(5000);
									return true;
								}
								else
									return false;
							}
						}
						//--- need code intervention
					}
				} else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(5000);
						return true;
					}
					else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
								+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result4 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(5000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("You have no life line left. Please select an option:");
								System.out.println("a) Agni\n"+
										"b) Indra\n"+
										"c) Hanuman\n"+
										"d) Ganesha\n");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(5000);
									return true;
								}
								else
									return false;
							}
						}
					}
				}
			}
		}

		else if (result2.equalsIgnoreCase("c")) {
			if (skip_cnt != 0) {
				skip_cnt = 0;
				Candidate.setAmount(5000);
				return true;
			} else {
				//
				System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
						+ "b. 50-50  \n" + "c. skip -- (not available)");
				System.out.println("Select the life line:");
				String result3 = sc.next();
				if (result3.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(5000);
							return true;
						} else {
							return false;
						}
					}
					else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result4 = sc.next();
						if(result4.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) Agni\n"+
										"d) Ganesha\n");								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(5000);
return  true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("You have no life line left. Please select an option:");
								System.out.println("a) Agni\n"+
										"b) Indra\n"+
										"c) Hanuman\n"+
										"d) Ganesha\n");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(5000);
									return true;
								}
								else
									return false;
							}
						}
						//--- need code intervention
					}
				} else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a) Agni\n"+
								"d) Ganesha\n");						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(5000);
							return true;
						} else {
							return false;
						}
					}
					else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
								+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result4 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(5000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("You have no life line left. Please select an option:");
								System.out.println("a) Agni\n"+
										"b) Indra\n"+
										"c) Hanuman\n"+
										"d) Ganesha\n");		result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(5000);
									return true;
								}
								else
									return false;
							}
						}
					}
				}
			}
		}
	}
	//changes in line 122
	else {
		System.out.println("You have no life line left. Please select an option:");
		System.out.println("a) Agni\n"+
				"b) Indra\n"+
				"c) Hanuman\n"+
				"d) Ganesha\n");
		result = sc.next();
		if (result.equalsIgnoreCase("d")) {
			Candidate.setAmount(5000);
			return true;
		}
	}
}
return false;
}	
public static boolean fetchQuestion4(String name) throws Exception{
	System.out.println("4.In the game of ludo the discs or tokens are of how many colours?");
	System.out.println("a) One\n"+
			"b) Two\n"+
			"c) Three\n"+
			"d) Four\n"+
			"e)life line");
result = sc.next();
if (result.equalsIgnoreCase("d")) {
	Candidate.setAmount(10000);
	return true;
} else if (result.equalsIgnoreCase("e")) {
	if (count_life_line > 0) {
		count_life_line--;
		System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
		System.out.println("Select the life line:");
		String result2 = sc.next();
		if (result2.equalsIgnoreCase("a")) {
			if (aud_phn != 0) {
				aud_phn = 0;
				Thread.sleep(10000);
				System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
				System.out.println("Select the option");
				result = sc.next();
				if (result.equalsIgnoreCase("d")) {
					Candidate.setAmount(10000);
					return true;
				} else {
					return false;
				}
			} else {
				//
				System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
						+ "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result3 = sc.next();
				if (result3.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a)One\n"+
								"d) Four\n");						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(10000);
							return true;
						} else {
							return false;
						}
					}
					else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result4 = sc.next();
						if(result4.equalsIgnoreCase("c")) {
							if(skip_cnt!=0) {
								Candidate.setAmount(10000);
								return true;
							}
							else {
								System.out.println("You have no life line left. Please select an option:");
								System.out.println(
										"a)One\n"+
												"b) Two\n"+
												"c) Three\n"+
										"d) Four\n");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(10000);
									return true;
								}
								else
									return false;
							}
						}
						//--- need code intervention
					}
				} else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(10000);
						return true;
					}
					else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
								+ "b. 50-50 \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result4 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a)One\n"+
										"d) Four\n");								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(10000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("You have no life line left. Please select an option:");
								System.out.println(
										"a)One\n"+
												"b) Two\n"+
												"c) Three\n"+
										"d) Four\n");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(10000);
									return true;
								}
								else
									return false;
							}
						}
					}
				}
			}
		}
		else if (result2.equalsIgnoreCase("b")) {
			if (cnt_50_50 != 0) {
				cnt_50_50 = 0;
				System.out.println("Select the options");
				System.out.println("a)One\n"+
						"d) Four\n");				result = sc.next();
				if (result.equalsIgnoreCase("d")) {
					Candidate.setAmount(10000);
					return true;
				} else {
					return false;
				}

			} else {
				//
				System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
						+ "b. 50-50 -- (not available) \n" + "c. skip");
				System.out.println("Select the life line:");
				String result3 = sc.next();
				if (result3.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(10000);
							return true;
						} else {
							return false;
						}
					}
					else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result4 = sc.next();
						if(result4.equalsIgnoreCase("c")) {
							if(skip_cnt!=0) {
								Candidate.setAmount(10000);
								return true;
							}
							else {
								System.out.println("You have no life line left. Please select an option:");
								System.out.println(
										"a)One\n"+
												"b) Two\n"+
												"c) Three\n"+
										"d) Four\n");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(10000);
									return true;
								}
								else
									return false;
							}
						}
						//--- need code intervention
					}
				} else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(10000);
						return true;
					}
					else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
								+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result4 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(10000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("You have no life line left. Please select an option:");
								System.out.println(
										"a)One\n"+
												"b) Two\n"+
												"c) Three\n"+
										"d) Four\n");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(10000);
									return true;
								}
								else
									return false;
							}
						}
					}
				}
			}
		}

		else if (result2.equalsIgnoreCase("c")) {
			if (skip_cnt != 0) {
				skip_cnt = 0;
				Candidate.setAmount(10000);
				return true;
			} else {
				//
				System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
						+ "b. 50-50  \n" + "c. skip -- (not available)");
				System.out.println("Select the life line:");
				String result3 = sc.next();
				if (result3.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(10000);
							return true;
						} else {
							return false;
						}
					}
					else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result4 = sc.next();
						if(result4.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a)One\n"+
										"d) Four\n");								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(10000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("You have no life line left. Please select an option:");
								System.out.println(
										"a)One\n"+
												"b) Two\n"+
												"c) Three\n"+
										"d) Four\n");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(10000);
									return true;
								}
								else
									return false;
							}
						}
						//--- need code intervention
					}
				} else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a)One\n"+
								"d) Four\n");						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(10000);
							return true;
						} else {
							return false;
						}
					}
					else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
								+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result4 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(10000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("You have no life line left. Please select an option:");
								System.out.println(
										"a)One\n"+
												"b) Two\n"+
												"c) Three\n"+
										"d) Four\n");

								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(10000);
									return true;
								}
								else
									return false;
							}
						}
					}
				}
			}
		}
	}
	//changes in line 122
	else {
		System.out.println("You have no life line left. Please select an option:");
		System.out.println(
				"a)One\n"+
						"b) Two\n"+
						"c) Three\n"+
				"d) Four\n");

		result = sc.next();
		if (result.equalsIgnoreCase("d")) {
			Candidate.setAmount(10000);
			return true;
		}
	}
}
return false;
}
public static boolean fetchQuestion5(String name) throws Exception{
	System.out.println("5.Which of these are names of national parks located in Madhya Pradesh?");
	System.out.println("a) Krishna and Kanhaiya\n"+
			"b) Girdhar and Gopal\n"+
			"c) Ghanshyam and Murari\n"+
			"d) Kanha and Madhav \n"+
			"e)life line");
result = sc.next();
if (result.equalsIgnoreCase("d")) {
	Candidate.setAmount(20000);
	return true;
} else if (result.equalsIgnoreCase("e")) {
	if (count_life_line > 0) {
		count_life_line--;
		System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
		System.out.println("Select the life line:");
		String result2 = sc.next();
		if (result2.equalsIgnoreCase("a")) {
			if (aud_phn != 0) {
				aud_phn = 0;
				Thread.sleep(10000);
				System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
				System.out.println("Select the option");
				result = sc.next();
				if (result.equalsIgnoreCase("d")) {
					Candidate.setAmount(20000);
					return true;
				} else {
					return false;
				}
			} else {
				//
				System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
						+ "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result3 = sc.next();
				if (result3.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a) Krishna and Kanhaiya\n"+
								"d) Kanha and Madhav \n");						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(20000);
							return true;
						} else {
							return false;
						}
					}
					else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result4 = sc.next();
						if(result4.equalsIgnoreCase("c")) {
							if(skip_cnt!=0) {
								Candidate.setAmount(20000);
								return true;
							}
							else {
								System.out.println("You have no life line left. Please select an option:");
								System.out.println("a) Krishna and Kanhaiya\n"+
										"b) Girdhar and Gopal\n"+
										"c) Ghanshyam and Murari\n"+
										"d) Kanha and Madhav \n");									result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(20000);
									return true;
								}
								else
									return false;
							}
						}
						//--- need code intervention
					}
				} else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(20000);
						return true;
					}
					else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
								+ "b. 50-50 \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result4 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) Krishna and Kanhaiya\n"+
										"d) Kanha and Madhav \n");								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(20000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("You have no life line left. Please select an option:");
								System.out.println("a) Krishna and Kanhaiya\n"+
										"b) Girdhar and Gopal\n"+
										"c) Ghanshyam and Murari\n"+
										"d) Kanha and Madhav \n");									result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(20000);
									return true;
								}
								else
									return false;
							}
						}
					}
				}
			}
		}
		else if (result2.equalsIgnoreCase("b")) {
			if (cnt_50_50 != 0) {
				cnt_50_50 = 0;
				System.out.println("Select the options");
				System.out.println("a) Krishna and Kanhaiya\n"+
						"d) Kanha and Madhav \n");				result = sc.next();
				if (result.equalsIgnoreCase("d")) {
					Candidate.setAmount(20000);
					return true;
				} else {
					return false;
				}

			} else {
				//
				System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
						+ "b. 50-50 -- (not available) \n" + "c. skip");
				System.out.println("Select the life line:");
				String result3 = sc.next();
				if (result3.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(20000);
							return true;
						} else {
							return false;
						}
					}
					else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result4 = sc.next();
						if(result4.equalsIgnoreCase("c")) {
							if(skip_cnt!=0) {
								Candidate.setAmount(20000);
								return true;
							}
							else {
								System.out.println("You have no life line left. Please select an option:");
								System.out.println("a) Krishna and Kanhaiya\n"+
										"b) Girdhar and Gopal\n"+
										"c) Ghanshyam and Murari\n"+
										"d) Kanha and Madhav \n");									result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(20000);
									return true;
								}
								else
									return false;
							}
						}
						//--- need code intervention
					}
				} else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(20000);
						return true;
					}
					else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
								+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result4 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(20000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("You have no life line left. Please select an option:");
								System.out.println("a) Krishna and Kanhaiya\n"+
										"b) Girdhar and Gopal\n"+
										"c) Ghanshyam and Murari\n"+
										"d) Kanha and Madhav \n");									result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(20000);
									return true;
								}
								else
									return false;
							}
						}
					}
				}
			}
		}

		else if (result2.equalsIgnoreCase("c")) {
			if (skip_cnt != 0) {
				skip_cnt = 0;
				Candidate.setAmount(20000);
				return true;
			} else {
				//
				System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
						+ "b. 50-50  \n" + "c. skip -- (not available)");
				System.out.println("Select the life line:");
				String result3 = sc.next();
				if (result3.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(20000);
							return true;
						} else {
							return false;
						}
					}
					else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result4 = sc.next();
						if(result4.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) Krishna and Kanhaiya\n"+
										"d) Kanha and Madhav \n");								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(20000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("You have no life line left. Please select an option:");
								System.out.println("a) Krishna and Kanhaiya\n"+
										"b) Girdhar and Gopal\n"+
										"c) Ghanshyam and Murari\n"+
										"d) Kanha and Madhav \n");									result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(20000);
									return true;
								}
								else
									return false;
							}
						}
						//--- need code intervention
					}
				} else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a) Krishna and Kanhaiya\n"+
								"d) Kanha and Madhav \n");						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(20000);
							return true;
						} else {
							return false;
						}
					}
					else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
								+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result4 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(20000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("You have no life line left. Please select an option:");
								System.out.println("a) Krishna and Kanhaiya\n"+
										"b) Girdhar and Gopal\n"+
										"c) Ghanshyam and Murari\n"+
										"d) Kanha and Madhav \n");									result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(20000);
									return true;
								}
								else
									return false;
							}
						}
					}
				}
			}
		}
	}
	//changes in line 122
	else {
		System.out.println("You have no life line left. Please select an option:");
		System.out.println("a) Krishna and Kanhaiya\n"+
				"b) Girdhar and Gopal\n"+
				"c) Ghanshyam and Murari\n"+
				"d) Kanha and Madhav \n");	
		result = sc.next();
		if (result.equalsIgnoreCase("d")) {
			Candidate.setAmount(20000);
			return true;
		}
	}
}
return false;
}	

public static boolean fetchQuestion6(String name)throws Exception {
	System.out.println("6. Where was the BRICS summit held in 2014");
	System.out.println("a) China\n"+
			"b) India\n"+
			"c) Russia\n"+
			"d) Brazil \n"+
			"e)life line");
result = sc.next();
if (result.equalsIgnoreCase("d")) {
	Candidate.setAmount(40000);
	return true;
} else if (result.equalsIgnoreCase("e")) {
	if (count_life_line > 0) {
		count_life_line--;
		System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
		System.out.println("Select the life line:");
		String result2 = sc.next();
		if (result2.equalsIgnoreCase("a")) {
			if (aud_phn != 0) {
				aud_phn = 0;
				Thread.sleep(10000);
				System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
				System.out.println("Select the option");
				result = sc.next();
				if (result.equalsIgnoreCase("d")) {
					Candidate.setAmount(40000);
					return true;
				} else {
					return false;
				}
			} else {
				//
				System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
						+ "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result3 = sc.next();
				if (result3.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a) China\n"+
								"d) Brazil \n");						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(40000);
							return true;
						} else {
							return false;
						}
					}
					else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result4 = sc.next();
						if(result4.equalsIgnoreCase("c")) {
							if(skip_cnt!=0) {
								Candidate.setAmount(40000);
								return true;
							}
							else {
								System.out.println("You have no life line left. Please select an option:");
								System.out.println("a) China\n"+
										"b) India\n"+
										"c) Russia\n"+
										"d) Brazil \n");								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(40000);
									return true;
								}
								else
									return false;
							}
						}
						//--- need code intervention
					}
				} else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(40000);
						return true;
					}
					else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
								+ "b. 50-50 \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result4 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) China\n"+
										"d) Brazil \n");								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(40000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("You have no life line left. Please select an option:");
								System.out.println("a) China\n"+
										"b) India\n"+
										"c) Russia\n"+
										"d) Brazil \n");								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(40000);
									return true;
								}
								else
									return false;
							}
						}
					}
				}
			}
		}
		else if (result2.equalsIgnoreCase("b")) {
			if (cnt_50_50 != 0) {
				cnt_50_50 = 0;
				System.out.println("Select the options");
				System.out.println("a) China\n"+
						"d) Brazil \n");				result = sc.next();
				if (result.equalsIgnoreCase("d")) {
					Candidate.setAmount(40000);
					return true;
				} else {
					return false;
				}

			} else {
				//
				System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
						+ "b. 50-50 -- (not available) \n" + "c. skip");
				System.out.println("Select the life line:");
				String result3 = sc.next();
				if (result3.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(40000);
							return true;
						} else {
							return false;
						}
					}
					else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result4 = sc.next();
						if(result4.equalsIgnoreCase("c")) {
							if(skip_cnt!=0) {
								Candidate.setAmount(40000);
								return true;
							}
							else {
								System.out.println("You have no life line left. Please select an option:");
								System.out.println("a) China\n"+
										"b) India\n"+
										"c) Russia\n"+
										"d) Brazil \n");								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(40000);
									return true;
								}
								else
									return false;
							}
						}
						//--- need code intervention
					}
				} else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(40000);
						return true;
					}
					else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
								+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result4 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(40000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("You have no life line left. Please select an option:");
								System.out.println("a) China\n"+
										"b) India\n"+
										"c) Russia\n"+
										"d) Brazil \n");								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(40000);
									return true;
								}
								else
									return false;
							}
						}
					}
				}
			}
		}

		else if (result2.equalsIgnoreCase("c")) {
			if (skip_cnt != 0) {
				skip_cnt = 0;
				Candidate.setAmount(40000);
				return true;
			} else {
				//
				System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
						+ "b. 50-50  \n" + "c. skip -- (not available)");
				System.out.println("Select the life line:");
				String result3 = sc.next();
				if (result3.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(40000);
							return true;
						} else {
							return false;
						}
					}
					else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result4 = sc.next();
						if(result4.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) China\n"+
										"d) Brazil \n");								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(40000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("You have no life line left. Please select an option:");
								System.out.println("a) China\n"+
										"b) India\n"+
										"c) Russia\n"+
										"d) Brazil \n");								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(40000);
									return true;
								}
								else
									return false;
							}
						}
						//--- need code intervention
					}
				} else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a) China\n"+
								"d) Brazil \n");						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(40000);
							return true;
						} else {
							return false;
						}
					}
					else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
								+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result4 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(40000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("You have no life line left. Please select an option:");
								System.out.println("a) China\n"+
										"b) India\n"+
										"c) Russia\n"+
										"d) Brazil \n");								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(40000);
									return true;
								}
								else
									return false;
							}
						}
					}
				}
			}
		}
	}
	//changes in line 122
	else {
		System.out.println("You have no life line left. Please select an option:");
		System.out.println("a) China\n"+
				"b) India\n"+
				"c) Russia\n"+
				"d) Brazil \n");		result = sc.next();
		if (result.equalsIgnoreCase("d")) {
			Candidate.setAmount(40000);
			return true;
		}
	}
}
return false;
}	
public static boolean fetchQuestion7(String name)throws Exception {
	System.out.println("7. Who wrote the introduction to the English translation of Rabrindranath Tagore's Gitanjali?");
	System.out.println("a) P.B.Shelley\n"+
			"b) Alfred Tennyson\n"+
			"c) T.S.Elliot\n"+
			"d) W.B.Yeats\n"+
			"e)life line");
result = sc.next();
if (result.equalsIgnoreCase("d")) {
	Candidate.setAmount(50000);
	return true;
} else if (result.equalsIgnoreCase("e")) {
	if (count_life_line > 0) {
		count_life_line--;
		System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
		System.out.println("Select the life line:");
		String result2 = sc.next();
		if (result2.equalsIgnoreCase("a")) {
			if (aud_phn != 0) {
				aud_phn = 0;
				Thread.sleep(10000);
				System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
				System.out.println("Select the option");
				result = sc.next();
				if (result.equalsIgnoreCase("d")) {
					Candidate.setAmount(50000);
					return true;
				} else {
					return false;
				}
			} else {
				//
				System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
						+ "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result3 = sc.next();
				if (result3.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a) P.B.Shelley\n"+
								"d) W.B.Yeats\n");							result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(50000);
							return true;
						} else {
							return false;
						}
					}
					else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result4 = sc.next();
						if(result4.equalsIgnoreCase("c")) {
							if(skip_cnt!=0) {
								Candidate.setAmount(50000);
								return true;
							}
							else {
								System.out.println("You have no life line left. Please select an option:");
								System.out.println("a) P.B.Shelley\n"+
										"b) Alfred Tennyson\n"+
										"c) T.S.Elliot\n"+
										"d) W.B.Yeats\n");									result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(50000);
									return true;
								}
								else
									return false;
							}
						}
						//--- need code intervention
					}
				} else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(50000);
						return true;
					}
					else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
								+ "b. 50-50 \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result4 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) P.B.Shelley\n"+
										"d) W.B.Yeats\n");									result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(50000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("You have no life line left. Please select an option:");
								System.out.println("a) P.B.Shelley\n"+
										"b) Alfred Tennyson\n"+
										"c) T.S.Elliot\n"+
										"d) W.B.Yeats\n");									result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(50000);
									return true;
								}
								else
									return false;
							}
						}
					}
				}
			}
		}
		else if (result2.equalsIgnoreCase("b")) {
			if (cnt_50_50 != 0) {
				cnt_50_50 = 0;
				System.out.println("Select the options");
				System.out.println("a) P.B.Shelley\n"+
						"d) W.B.Yeats\n");					result = sc.next();
				if (result.equalsIgnoreCase("d")) {
					Candidate.setAmount(50000);
					return true;
				} else {
					return false;
				}

			} else {
				//
				System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
						+ "b. 50-50 -- (not available) \n" + "c. skip");
				System.out.println("Select the life line:");
				String result3 = sc.next();
				if (result3.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(50000);
							return true;
						} else {
							return false;
						}
					}
					else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result4 = sc.next();
						if(result4.equalsIgnoreCase("c")) {
							if(skip_cnt!=0) {
								Candidate.setAmount(50000);
								return true;
							}
							else {
								System.out.println("You have no life line left. Please select an option:");
								System.out.println("a) P.B.Shelley\n"+
										"b) Alfred Tennyson\n"+
										"c) T.S.Elliot\n"+
										"d) W.B.Yeats\n");									result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(50000);
									return true;
								}
								else
									return false;
							}
						}
						//--- need code intervention
					}
				} else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(50000);
						return true;
					}
					else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
								+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result4 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(50000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("You have no life line left. Please select an option:");
								System.out.println("a) P.B.Shelley\n"+
										"b) Alfred Tennyson\n"+
										"c) T.S.Elliot\n"+
										"d) W.B.Yeats\n");									result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(50000);
									return true;
								}
								else
									return false;
							}
						}
					}
				}
			}
		}

		else if (result2.equalsIgnoreCase("c")) {
			if (skip_cnt != 0) {
				skip_cnt = 0;
				Candidate.setAmount(50000);
				return true;
			} else {
				//
				System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
						+ "b. 50-50  \n" + "c. skip -- (not available)");
				System.out.println("Select the life line:");
				String result3 = sc.next();
				if (result3.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(50000);
							return true;
						} else {
							return false;
						}
					}
					else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result4 = sc.next();
						if(result4.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) P.B.Shelley\n"+
										"d) W.B.Yeats\n");									result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(50000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("You have no life line left. Please select an option:");
								System.out.println("a) P.B.Shelley\n"+
										"b) Alfred Tennyson\n"+
										"c) T.S.Elliot\n"+
										"d) W.B.Yeats\n");									result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(50000);
									return true;
								}
								else
									return false;
							}
						}
						//--- need code intervention
					}
				} else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a) P.B.Shelley\n"+
								"d) W.B.Yeats\n");							result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(50000);
							return true;
						} else {
							return false;
						}
					}
					else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
								+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result4 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(50000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("You have no life line left. Please select an option:");
								System.out.println("a) P.B.Shelley\n"+
										"b) Alfred Tennyson\n"+
										"c) T.S.Elliot\n"+
										"d) W.B.Yeats\n");									result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(50000);
									return true;
								}
								else
									return false;
							}
						}
					}
				}
			}
		}
	}
	//changes in line 122
	else {
		System.out.println("You have no life line left. Please select an option:");
		System.out.println("a) P.B.Shelley\n"+
				"b) Alfred Tennyson\n"+
				"c) T.S.Elliot\n"+
				"d) W.B.Yeats\n");			result = sc.next();
		if (result.equalsIgnoreCase("d")) {
			Candidate.setAmount(50000);
			return true;
		}
	}
}
return false;
}	

public static boolean fetchQuestion8(String name) throws Exception{
	System.out.println("8. The wife of which of these famous sports persons was once captain of Indian volleyball team? ");
	System.out.println("a) K.D.Jadav\n"+
			"b) Dhyan Chand\n"+
			"c) Prakash Padukone\n"+
			"d) Milkha Singh\n"+
			"e)life line");
result = sc.next();
if (result.equalsIgnoreCase("d")) {
	Candidate.setAmount(80000);
	return true;
} else if (result.equalsIgnoreCase("e")) {
	if (count_life_line > 0) {
		count_life_line--;
		System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
		System.out.println("Select the life line:");
		String result2 = sc.next();
		if (result2.equalsIgnoreCase("a")) {
			if (aud_phn != 0) {
				aud_phn = 0;
				Thread.sleep(10000);
				System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
				System.out.println("Select the option");
				result = sc.next();
				if (result.equalsIgnoreCase("d")) {
					Candidate.setAmount(80000);
					return true;
				} else {
					return false;
				}
			} else {
				//
				System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
						+ "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result3 = sc.next();
				if (result3.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a) K.D.Jadav\n"+
								"d) Milkha Singh\n");						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(80000);
							return true;
						} else {
							return false;
						}
					}
					else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result4 = sc.next();
						if(result4.equalsIgnoreCase("c")) {
							if(skip_cnt!=0) {
								Candidate.setAmount(80000);
								return true;
							}
							else {
								System.out.println("You have no life line left. Please select an option:");
								System.out.println("a) K.D.Jadav\n"+
										"b) Dhyan Chand\n"+
										"c) Prakash Padukone\n"+
										"d) Milkha Singh\n");									result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(80000);
									return true;
								}
								else
									return false;
							}
						}
						//--- need code intervention
					}
				} else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(80000);
						return true;
					}
					else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
								+ "b. 50-50 \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result4 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) K.D.Jadav\n"+
										"d) Milkha Singh\n");								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(80000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("You have no life line left. Please select an option:");
								System.out.println("a) K.D.Jadav\n"+
										"b) Dhyan Chand\n"+
										"c) Prakash Padukone\n"+
										"d) Milkha Singh\n");									result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(80000);
									return true;
								}
								else
									return false;
							}
						}
					}
				}
			}
		}
		else if (result2.equalsIgnoreCase("b")) {
			if (cnt_50_50 != 0) {
				cnt_50_50 = 0;
				System.out.println("Select the options");
				System.out.println("a) K.D.Jadav\n"+
						"d) Milkha Singh\n");				result = sc.next();
				if (result.equalsIgnoreCase("d")) {
					Candidate.setAmount(80000);
					return true;
				} else {
					return false;
				}

			} else {
				//
				System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
						+ "b. 50-50 -- (not available) \n" + "c. skip");
				System.out.println("Select the life line:");
				String result3 = sc.next();
				if (result3.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(80000);
							return true;
						} else {
							return false;
						}
					}
					else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result4 = sc.next();
						if(result4.equalsIgnoreCase("c")) {
							if(skip_cnt!=0) {
								Candidate.setAmount(80000);
								return true;
							}
							else {
								System.out.println("You have no life line left. Please select an option:");
								System.out.println("a) K.D.Jadav\n"+
										"b) Dhyan Chand\n"+
										"c) Prakash Padukone\n"+
										"d) Milkha Singh\n");									result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(80000);
									return true;
								}
								else
									return false;
							}
						}
						//--- need code intervention
					}
				} else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(80000);
						return true;
					}
					else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
								+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result4 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(80000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("You have no life line left. Please select an option:");
								System.out.println("a) K.D.Jadav\n"+
										"b) Dhyan Chand\n"+
										"c) Prakash Padukone\n"+
										"d) Milkha Singh\n");									result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(80000);
									return true;
								}
								else
									return false;
							}
						}
					}
				}
			}
		}

		else if (result2.equalsIgnoreCase("c")) {
			if (skip_cnt != 0) {
				skip_cnt = 0;
				Candidate.setAmount(80000);
				return true;
			} else {
				//
				System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
						+ "b. 50-50  \n" + "c. skip -- (not available)");
				System.out.println("Select the life line:");
				String result3 = sc.next();
				if (result3.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(80000);
							return true;
						} else {
							return false;
						}
					}
					else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result4 = sc.next();
						if(result4.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) K.D.Jadav\n"+
										"d) Milkha Singh\n");								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(80000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("You have no life line left. Please select an option:");
								System.out.println("a) K.D.Jadav\n"+
										"b) Dhyan Chand\n"+
										"c) Prakash Padukone\n"+
										"d) Milkha Singh\n");									result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(80000);
									return true;
								}
								else
									return false;
							}
						}
						//--- need code intervention
					}
				} else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a) K.D.Jadav\n"+
								"d) Milkha Singh\n");						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(80000);
							return true;
						} else {
							return false;
						}
					}
					else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
								+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result4 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(80000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("You have no life line left. Please select an option:");
								System.out.println("a) K.D.Jadav\n"+
										"b) Dhyan Chand\n"+
										"c) Prakash Padukone\n"+
										"d) Milkha Singh\n");									result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(80000);
									return true;
								}
								else
									return false;
							}
						}
					}
				}
			}
		}
	}
	//changes in line 122
	else {
		System.out.println("You have no life line left. Please select an option:");
		System.out.println("a) K.D.Jadav\n"+
				"b) Dhyan Chand\n"+
				"c) Prakash Padukone\n"+
				"d) Milkha Singh\n");			result = sc.next();
		if (result.equalsIgnoreCase("d")) {
			Candidate.setAmount(80000);
			return true;
		}
	}
}
return false;
}
public static boolean fetchQuestion9(String name)throws Exception {
System.out.println("9.Starting with the earliest,arrange the following events in Narendra Modi's life in chronological order.FFF");
System.out.println("a) CM of Gujarat\n"+
		"b) Took oath as\n"+
		"c) Joined BJP\n"+
		"d) Because RSS Pracharak\n"+
		"e)life line");
	result = sc.next();
	if (result.equalsIgnoreCase("d")) {
		Candidate.setAmount(100000);
		return true;
	} else if (result.equalsIgnoreCase("e")) {
		if (count_life_line > 0) {
			count_life_line--;
			System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
			System.out.println("Select the life line:");
			String result2 = sc.next();
			if (result2.equalsIgnoreCase("a")) {
				if (aud_phn != 0) {
					aud_phn = 0;
					Thread.sleep(10000);
					System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
					System.out.println("Select the option");
					result = sc.next();
					if (result.equalsIgnoreCase("d")) {
						Candidate.setAmount(100000);
						return true;
					} else {
						return false;
					}
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
							+ "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a) CM of Gujarat\n"+
									"d) Because RSS Pracharak\n");							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								Candidate.setAmount(100000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									Candidate.setAmount(100000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) CM of Gujarat\n"+
											"b) Took oath as\n"+
											"c) Joined BJP\n"+
											"d) Because RSS Pracharak\n");									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(100000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(100000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
									+ "b. 50-50 \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) CM of Gujarat\n"+
											"d) Because RSS Pracharak\n");									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(100000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) CM of Gujarat\n"+
											"b) Took oath as\n"+
											"c) Joined BJP\n"+
											"d) Because RSS Pracharak\n");									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(100000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
			else if (result2.equalsIgnoreCase("b")) {
				if (cnt_50_50 != 0) {
					cnt_50_50 = 0;
					System.out.println("Select the options");
					System.out.println("a) CM of Gujarat\n"+
							"d) Because RSS Pracharak\n");					result = sc.next();
					if (result.equalsIgnoreCase("d")) {
						Candidate.setAmount(100000);
						return true;
					} else {
						return false;
					}

				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50 -- (not available) \n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								Candidate.setAmount(100000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									Candidate.setAmount(100000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) CM of Gujarat\n"+
											"b) Took oath as\n"+
											"c) Joined BJP\n"+
											"d) Because RSS Pracharak\n");									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(100000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(100000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(100000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) CM of Gujarat\n"+
											"b) Took oath as\n"+
											"c) Joined BJP\n"+
											"d) Because RSS Pracharak\n");									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(100000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}

			else if (result2.equalsIgnoreCase("c")) {
				if (skip_cnt != 0) {
					skip_cnt = 0;
					Candidate.setAmount(100000);
					return true;
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50  \n" + "c. skip -- (not available)");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								Candidate.setAmount(100000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) CM of Gujarat\n"+
											"d) Because RSS Pracharak\n");									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(100000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) CM of Gujarat\n"+
											"b) Took oath as\n"+
											"c) Joined BJP\n"+
											"d) Because RSS Pracharak\n");									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(100000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result2.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a) CM of Gujarat\n"+
									"d) Because RSS Pracharak\n");							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								Candidate.setAmount(100000);
								return true;
							} else {
								return false;
							}
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(100000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) CM of Gujarat\n"+
											"b) Took oath as\n"+
											"c) Joined BJP\n"+
											"d) Because RSS Pracharak\n");			
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(100000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
		}
		//changes in line 122
		else {
			System.out.println("You have no life line left. Please select an option:");
			System.out.println("a) CM of Gujarat\n"+
					"b) Took oath as\n"+
					"c) Joined BJP\n"+
					"d) Because RSS Pracharak\n");	
			result = sc.next();
			if (result.equalsIgnoreCase("d")) {
				Candidate.setAmount(100000);
				return true;
			}
		}
	}
	return false;
}	

public static boolean fetchQuestion10(String name)throws Exception {
System.out.println("10.Which of these terms can only be used for women?");
System.out.println("a) DIrghaayu\n"+
		"b) Sushil\n"+
		"c) Chiranjevi\n"+
		"d)  Suhagan\n"+
		"e)life line");
result = sc.next();
if (result.equalsIgnoreCase("d")) {
	Candidate.setAmount(150000);
	return true;
} else if (result.equalsIgnoreCase("e")) {
	if (count_life_line > 0) {
		count_life_line--;
		System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
		System.out.println("Select the life line:");
		String result2 = sc.next();
		if (result2.equalsIgnoreCase("a")) {
			if (aud_phn != 0) {
				aud_phn = 0;
				Thread.sleep(10000);
				System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
				System.out.println("Select the option");
				result = sc.next();
				if (result.equalsIgnoreCase("d")) {
					Candidate.setAmount(150000);
					return true;
				} else {
					return false;
				}
			} else {
				//
				System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
						+ "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result3 = sc.next();
				if (result3.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a) Dirghaayu\n"+
								"d)  Suhagan\n");						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(150000);
							return true;
						} else {
							return false;
						}
					}
					else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result4 = sc.next();
						if(result4.equalsIgnoreCase("c")) {
							if(skip_cnt!=0) {
								Candidate.setAmount(150000);
								return true;
							}
							else {
								System.out.println("You have no life line left. Please select an option:");
								System.out.println("a) Dirghaayu\n"+
										"b) Sushil\n"+
										"c) Chiranjevi\n"+
										"d)  Suhagan\n");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(150000);
									return true;
								}
								else
									return false;
							}
						}
						//--- need code intervention
					}
				} else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(150000);
						return true;
					}
					else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
								+ "b. 50-50 \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result4 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) Dirghaayu\n"+
										"d)  Suhagan\n");								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(150000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("You have no life line left. Please select an option:");
								System.out.println("a) Dirghaayu\n"+
										"b) Sushil\n"+
										"c) Chiranjevi\n"+
										"d)  Suhagan\n");								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(150000);
									return true;
								}
								else
									return false;
							}
						}
					}
				}
			}
		}
		else if (result2.equalsIgnoreCase("b")) {
			if (cnt_50_50 != 0) {
				cnt_50_50 = 0;
				System.out.println("Select the options");
				System.out.println("a) Dirghaayu\n"+
						"d)  Suhagan\n");				result = sc.next();
				if (result.equalsIgnoreCase("d")) {
					Candidate.setAmount(150000);
					return true;
				} else {
					return false;
				}

			} else {
				//
				System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
						+ "b. 50-50 -- (not available) \n" + "c. skip");
				System.out.println("Select the life line:");
				String result3 = sc.next();
				if (result3.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(150000);
							return true;
						} else {
							return false;
						}
					}
					else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result4 = sc.next();
						if(result4.equalsIgnoreCase("c")) {
							if(skip_cnt!=0) {
								Candidate.setAmount(150000);
								return true;
							}
							else {
								System.out.println("You have no life line left. Please select an option:");
								System.out.println("a) Dirghaayu\n"+
										"b) Sushil\n"+
										"c) Chiranjevi\n"+
										"d)  Suhagan\n");								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(150000);
									return true;
								}
								else
									return false;
							}
						}
						//--- need code intervention
					}
				} else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(150000);
						return true;
					}
					else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
								+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result4 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(150000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("You have no life line left. Please select an option:");
								System.out.println("a) Dirghaayu\n"+
										"b) Sushil\n"+
										"c) Chiranjevi\n"+
										"d)  Suhagan\n");								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(150000);
									return true;
								}
								else
									return false;
							}
						}
					}
				}
			}
		}

		else if (result2.equalsIgnoreCase("c")) {
			if (skip_cnt != 0) {
				skip_cnt = 0;
				Candidate.setAmount(150000);
				return true;
			} else {
				//
				System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
						+ "b. 50-50  \n" + "c. skip -- (not available)");
				System.out.println("Select the life line:");
				String result3 = sc.next();
				if (result3.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(150000);
							return true;
						} else {
							return false;
						}
					}
					else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result4 = sc.next();
						if(result4.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) Dirghaayu\n"+
										"d)  Suhagan\n");								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(150000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("You have no life line left. Please select an option:");
								System.out.println("a) Dirghaayu\n"+
										"b) Sushil\n"+
										"c) Chiranjevi\n"+
										"d)  Suhagan\n");								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(150000);
									return true;
								}
								else
									return false;
							}
						}
						//--- need code intervention
					}
				} else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a) Dirghaayu\n"+
								"d)  Suhagan\n");						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(150000);
							return true;
						} else {
							return false;
						}
					}
					else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
								+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result4 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(150000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("You have no life line left. Please select an option:");
								System.out.println("a) Dirghaayu\n"+
										"b) Sushil\n"+
										"c) Chiranjevi\n"+
										"d)  Suhagan\n");								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(150000);
									return true;
								}
								else
									return false;
							}
						}
					}
				}
			}
		}
	}
	//changes in line 122
	else {
		System.out.println("You have no life line left. Please select an option:");
		System.out.println("a) Dirghaayu\n"+
				"b) Sushil\n"+
				"c) Chiranjevi\n"+
				"d)  Suhagan\n");		result = sc.next();
		if (result.equalsIgnoreCase("d")) {
			Candidate.setAmount(150000);
			return true;
		}
	}
}
return false;
}	
}