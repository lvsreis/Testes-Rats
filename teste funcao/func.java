// ===========================================================================
// This file has been generated by
// Rats! Parser Generator, version 2.4.0,
// (C) 2004-2014 Robert Grimm,
// on sexta-feira, 13 de novembro de 2020 at 13:15:29.
// Edit at your own risk.
// ===========================================================================

import java.io.Reader;
import java.io.IOException;

import xtc.util.Pair;

import xtc.parser.ParserBase;
import xtc.parser.Column;
import xtc.parser.Result;
import xtc.parser.SemanticValue;
import xtc.parser.ParseError;

/**
 * Packrat parser for grammar <code>func</code>.
 *
 * <p />This class has been generated by the <i>Rats!</i> parser
 * generator, version 2.4.0, (C) 2004-2014 Robert Grimm.
 */
public final class func extends ParserBase {

  // =========================================================================

  /** Memoization table column. */
  static final class funcColumn extends Column {
    Result fW;
    Result fnome;
    Result fdeci;
    Result f$$Shared1;
    Result f$$Shared2;
  }

  // =========================================================================

  /**
   * Create a new packrat parser.
   *
   * @param reader The reader.
   * @param file The file name.
   */
  public func(final Reader reader, final String file) {
    super(reader, file);
  }

  /**
   * Create a new packrat parser.
   *
   * @param reader The file reader.
   * @param file The file name.
   * @param size The file size.
   */
  public func(final Reader reader, final String file, final int size) {
    super(reader, file, size);
  }

  // =========================================================================

  protected Column newColumn() {
    return new funcColumn();
  }

  // =========================================================================

  /**
   * Parse nonterminal func.prog.
   *
   * @param yyStart The index.
   * @return The result.
   * @throws IOException Signals an I/O error.
   */
  public Result pprog(final int yyStart) throws IOException {
    int        yyC;
    int        yyIndex;
    Result     yyResult;
    int        yyBase;
    int        yyRepetition1;
    Void       yyValue;
    ParseError yyError = ParseError.DUMMY;

    // Alternative 1.

    yyResult = ptipo(yyStart);
    yyError  = yyResult.select(yyError);
    if (yyResult.hasValue()) {

      yyResult = pW(yyResult.index);
      yyError  = yyResult.select(yyError);
      if (yyResult.hasValue()) {

        yyResult = pnome(yyResult.index);
        yyError  = yyResult.select(yyError);
        if (yyResult.hasValue()) {

          yyRepetition1 = yyResult.index;
          while (true) {

            yyResult = pW(yyRepetition1);
            yyError  = yyResult.select(yyError, yyRepetition1);
            if (yyResult.hasValue()) {

              yyRepetition1 = yyResult.index;
              continue;
            }
            break;
          }

          yyBase = yyRepetition1;
          yyC    = character(yyBase);
          if ('(' == yyC) {
            yyIndex = yyRepetition1 + 1;

            yyBase = yyIndex;
            yyC    = character(yyBase);
            if (')' == yyC) {
              yyIndex = yyIndex + 1;

              yyResult = pW(yyIndex);
              yyError  = yyResult.select(yyError);
              if (yyResult.hasValue()) {

                yyBase = yyResult.index;
                yyC    = character(yyBase);
                if ('{' == yyC) {
                  yyIndex = yyResult.index + 1;

                  yyResult = pW(yyIndex);
                  yyError  = yyResult.select(yyError);
                  if (yyResult.hasValue()) {

                    yyRepetition1 = yyResult.index;
                    while (true) {

                      yyResult = ptipos(yyRepetition1);
                      yyError  = yyResult.select(yyError, yyRepetition1);
                      if (yyResult.hasValue()) {

                        yyRepetition1 = yyResult.index;
                        continue;
                      }
                      break;
                    }

                    while (true) {

                      yyResult = pW(yyRepetition1);
                      yyError  = yyResult.select(yyError, yyRepetition1);
                      if (yyResult.hasValue()) {

                        yyRepetition1 = yyResult.index;
                        continue;
                      }
                      break;
                    }

                    yyBase = yyRepetition1;
                    yyC    = character(yyBase);
                    if ('}' == yyC) {
                      yyIndex = yyRepetition1 + 1;

                      yyRepetition1 = yyIndex;
                      while (true) {

                        yyResult = pW(yyRepetition1);
                        yyError  = yyResult.select(yyError, yyRepetition1);
                        if (yyResult.hasValue()) {

                          yyRepetition1 = yyResult.index;
                          continue;
                        }
                        break;
                      }

                      yyValue = null;

                      return new SemanticValue(yyValue, yyRepetition1, yyError);
                    } else {
                      yyError = yyError.select("'}' expected", yyBase);
                    }
                  }
                } else {
                  yyError = yyError.select("'{' expected", yyBase);
                }
              }
            } else {
              yyError = yyError.select("')' expected", yyBase);
            }
          } else {
            yyError = yyError.select("'(' expected", yyBase);
          }
        }
      }
    }

    // Done.
    return yyError;
  }

  // =========================================================================

  /**
   * Parse nonterminal func.tipo.
   *
   * @param yyStart The index.
   * @return The result.
   * @throws IOException Signals an I/O error.
   */
  public Result ptipo(final int yyStart) throws IOException {
    int        yyC;
    int        yyIndex;
    Void       yyValue;
    ParseError yyError = ParseError.DUMMY;

    // Alternative 1.

    yyC = character(yyStart);
    if (-1 != yyC) {
      yyIndex = yyStart + 1;

      switch (yyC) {
      case 'i':
        {
          yyC = character(yyIndex);
          if (-1 != yyC) {
            yyIndex = yyIndex + 1;
            if ('n' == yyC) {

              yyC = character(yyIndex);
              if (-1 != yyC) {
                yyIndex = yyIndex + 1;
                if ('t' == yyC) {

                  yyValue = null;

                  return new SemanticValue(yyValue, yyIndex, yyError);
                }
              }
            }
          }
        }
        break;

      case 'f':
        {
          yyC = character(yyIndex);
          if (-1 != yyC) {
            yyIndex = yyIndex + 1;
            if ('l' == yyC) {

              yyC = character(yyIndex);
              if (-1 != yyC) {
                yyIndex = yyIndex + 1;
                if ('o' == yyC) {

                  yyC = character(yyIndex);
                  if (-1 != yyC) {
                    yyIndex = yyIndex + 1;
                    if ('a' == yyC) {

                      yyC = character(yyIndex);
                      if (-1 != yyC) {
                        yyIndex = yyIndex + 1;
                        if ('t' == yyC) {

                          yyValue = null;

                          return new SemanticValue(yyValue, yyIndex, yyError);
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        break;

      case 'v':
        {
          yyC = character(yyIndex);
          if (-1 != yyC) {
            yyIndex = yyIndex + 1;
            if ('o' == yyC) {

              yyC = character(yyIndex);
              if (-1 != yyC) {
                yyIndex = yyIndex + 1;
                if ('i' == yyC) {

                  yyC = character(yyIndex);
                  if (-1 != yyC) {
                    yyIndex = yyIndex + 1;
                    if ('d' == yyC) {

                      yyValue = null;

                      return new SemanticValue(yyValue, yyIndex, yyError);
                    }
                  }
                }
              }
            }
          }
        }
        break;

      case 'b':
        {
          yyC = character(yyIndex);
          if (-1 != yyC) {
            yyIndex = yyIndex + 1;
            if ('o' == yyC) {

              yyC = character(yyIndex);
              if (-1 != yyC) {
                yyIndex = yyIndex + 1;
                if ('o' == yyC) {

                  yyC = character(yyIndex);
                  if (-1 != yyC) {
                    yyIndex = yyIndex + 1;
                    if ('l' == yyC) {

                      yyValue = null;

                      return new SemanticValue(yyValue, yyIndex, yyError);
                    }
                  }
                }
              }
            }
          }
        }
        break;

      case 'c':
        {
          yyC = character(yyIndex);
          if (-1 != yyC) {
            yyIndex = yyIndex + 1;
            if ('h' == yyC) {

              yyC = character(yyIndex);
              if (-1 != yyC) {
                yyIndex = yyIndex + 1;
                if ('a' == yyC) {

                  yyC = character(yyIndex);
                  if (-1 != yyC) {
                    yyIndex = yyIndex + 1;
                    if ('r' == yyC) {

                      yyValue = null;

                      return new SemanticValue(yyValue, yyIndex, yyError);
                    }
                  }
                }
              }
            }
          }
        }
        break;

      default:
        /* No match. */
      }
    }

    // Done.
    yyError = yyError.select("tipo expected", yyStart);
    return yyError;
  }

  // =========================================================================

  /**
   * Parse nonterminal func.W.
   *
   * @param yyStart The index.
   * @return The result.
   * @throws IOException Signals an I/O error.
   */
  public Result pW(final int yyStart) throws IOException {
    funcColumn yyColumn = (funcColumn)column(yyStart);
    if (null == yyColumn.fW) yyColumn.fW = pW$1(yyStart);
    return yyColumn.fW;
  }

  /** Actually parse func.W. */
  private Result pW$1(final int yyStart) throws IOException {
    int        yyC;
    int        yyIndex;
    Result     yyResult;
    Void       yyValue;
    ParseError yyError = ParseError.DUMMY;

    // Alternative 1.

    yyC = character(yyStart);
    if (-1 != yyC) {
      yyIndex = yyStart + 1;

      switch (yyC) {
      case ' ':
        {
          final int yyChoice1 = yyIndex;

          // Nested alternative 1.

          yyResult = pW(yyChoice1);
          yyError  = yyResult.select(yyError);
          if (yyResult.hasValue()) {

            yyValue = null;

            return yyResult.createValue(yyValue, yyError);
          }

          // Nested alternative 2.

          yyValue = null;

          return new SemanticValue(yyValue, yyChoice1, yyError);
        }

      case '\r':
        {
          final int yyChoice1 = yyIndex;

          // Nested alternative 1.

          yyResult = pW(yyChoice1);
          yyError  = yyResult.select(yyError);
          if (yyResult.hasValue()) {

            yyValue = null;

            return yyResult.createValue(yyValue, yyError);
          }

          // Nested alternative 2.

          yyValue = null;

          return new SemanticValue(yyValue, yyChoice1, yyError);
        }

      case '\n':
        {
          final int yyChoice1 = yyIndex;

          // Nested alternative 1.

          yyResult = pW(yyChoice1);
          yyError  = yyResult.select(yyError);
          if (yyResult.hasValue()) {

            yyValue = null;

            return yyResult.createValue(yyValue, yyError);
          }

          // Nested alternative 2.

          yyValue = null;

          return new SemanticValue(yyValue, yyChoice1, yyError);
        }

      case '\t':
        {
          final int yyChoice1 = yyIndex;

          // Nested alternative 1.

          yyResult = pW(yyChoice1);
          yyError  = yyResult.select(yyError);
          if (yyResult.hasValue()) {

            yyValue = null;

            return yyResult.createValue(yyValue, yyError);
          }

          // Nested alternative 2.

          yyValue = null;

          return new SemanticValue(yyValue, yyChoice1, yyError);
        }

      default:
        /* No match. */
      }
    }

    // Done.
    yyError = yyError.select("W expected", yyStart);
    return yyError;
  }

  // =========================================================================

  /**
   * Parse nonterminal func.nome.
   *
   * @param yyStart The index.
   * @return The result.
   * @throws IOException Signals an I/O error.
   */
  public Result pnome(final int yyStart) throws IOException {
    funcColumn yyColumn = (funcColumn)column(yyStart);
    if (null == yyColumn.fnome) yyColumn.fnome = pnome$1(yyStart);
    return yyColumn.fnome;
  }

  /** Actually parse func.nome. */
  private Result pnome$1(final int yyStart) throws IOException {
    int        yyC;
    int        yyIndex;
    Result     yyResult;
    Void       yyValue;
    ParseError yyError = ParseError.DUMMY;

    // Alternative 1.

    yyC = character(yyStart);
    if (-1 != yyC) {
      yyIndex = yyStart + 1;
      if ((('A' <= yyC) && (yyC <= 'Z')) ||
          (('a' <= yyC) && (yyC <= 'z'))) {

        final int yyChoice1 = yyIndex;

        // Nested alternative 1.

        yyResult = pnome(yyChoice1);
        yyError  = yyResult.select(yyError);
        if (yyResult.hasValue()) {

          yyValue = null;

          return yyResult.createValue(yyValue, yyError);
        }

        // Nested alternative 2.

        yyValue = null;

        return new SemanticValue(yyValue, yyChoice1, yyError);
      }
    }

    // Done.
    yyError = yyError.select("nome expected", yyStart);
    return yyError;
  }

  // =========================================================================

  /**
   * Parse nonterminal func.tipos.
   *
   * @param yyStart The index.
   * @return The result.
   * @throws IOException Signals an I/O error.
   */
  public Result ptipos(final int yyStart) throws IOException {
    int        yyC;
    int        yyIndex;
    Result     yyResult;
    Void       yyValue;
    ParseError yyError = ParseError.DUMMY;

    // Alternative 1.

    yyC = character(yyStart);
    if (-1 != yyC) {
      yyIndex = yyStart + 1;

      switch (yyC) {
      case 'i':
        {
          yyC = character(yyIndex);
          if (-1 != yyC) {
            yyIndex = yyIndex + 1;
            if ('n' == yyC) {

              yyC = character(yyIndex);
              if (-1 != yyC) {
                yyIndex = yyIndex + 1;
                if ('t' == yyC) {

                  yyResult = pW(yyIndex);
                  yyError  = yyResult.select(yyError);
                  if (yyResult.hasValue()) {

                    yyResult = pint(yyResult.index);
                    yyError  = yyResult.select(yyError);
                    if (yyResult.hasValue()) {

                      yyResult = pW(yyResult.index);
                      yyError  = yyResult.select(yyError);
                      if (yyResult.hasValue()) {

                        yyValue = null;

                        return yyResult.createValue(yyValue, yyError);
                      }
                    }
                  }
                }
              }
            }
          }
        }
        break;

      case 'd':
        {
          yyC = character(yyIndex);
          if (-1 != yyC) {
            yyIndex = yyIndex + 1;
            if ('o' == yyC) {

              yyC = character(yyIndex);
              if (-1 != yyC) {
                yyIndex = yyIndex + 1;
                if ('u' == yyC) {

                  yyC = character(yyIndex);
                  if (-1 != yyC) {
                    yyIndex = yyIndex + 1;
                    if ('b' == yyC) {

                      yyC = character(yyIndex);
                      if (-1 != yyC) {
                        yyIndex = yyIndex + 1;
                        if ('l' == yyC) {

                          yyC = character(yyIndex);
                          if (-1 != yyC) {
                            yyIndex = yyIndex + 1;
                            if ('e' == yyC) {

                              yyResult = pW(yyIndex);
                              yyError  = yyResult.select(yyError);
                              if (yyResult.hasValue()) {

                                yyResult = pdeci(yyResult.index);
                                yyError  = yyResult.select(yyError);
                                if (yyResult.hasValue()) {

                                  yyResult = pW(yyResult.index);
                                  yyError  = yyResult.select(yyError);
                                  if (yyResult.hasValue()) {

                                    yyValue = null;

                                    return yyResult.createValue(yyValue, yyError);
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        break;

      case 'f':
        {
          yyC = character(yyIndex);
          if (-1 != yyC) {
            yyIndex = yyIndex + 1;
            if ('l' == yyC) {

              yyC = character(yyIndex);
              if (-1 != yyC) {
                yyIndex = yyIndex + 1;
                if ('o' == yyC) {

                  yyC = character(yyIndex);
                  if (-1 != yyC) {
                    yyIndex = yyIndex + 1;
                    if ('a' == yyC) {

                      yyC = character(yyIndex);
                      if (-1 != yyC) {
                        yyIndex = yyIndex + 1;
                        if ('t' == yyC) {

                          yyResult = pW(yyIndex);
                          yyError  = yyResult.select(yyError);
                          if (yyResult.hasValue()) {

                            yyResult = pdeci(yyResult.index);
                            yyError  = yyResult.select(yyError);
                            if (yyResult.hasValue()) {

                              yyResult = pW(yyResult.index);
                              yyError  = yyResult.select(yyError);
                              if (yyResult.hasValue()) {

                                yyValue = null;

                                return yyResult.createValue(yyValue, yyError);
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        break;

      case 'c':
        {
          yyC = character(yyIndex);
          if (-1 != yyC) {
            yyIndex = yyIndex + 1;
            if ('h' == yyC) {

              yyC = character(yyIndex);
              if (-1 != yyC) {
                yyIndex = yyIndex + 1;
                if ('a' == yyC) {

                  yyC = character(yyIndex);
                  if (-1 != yyC) {
                    yyIndex = yyIndex + 1;
                    if ('r' == yyC) {

                      yyResult = pW(yyIndex);
                      yyError  = yyResult.select(yyError);
                      if (yyResult.hasValue()) {

                        yyResult = pchar(yyResult.index);
                        yyError  = yyResult.select(yyError);
                        if (yyResult.hasValue()) {

                          yyResult = pW(yyResult.index);
                          yyError  = yyResult.select(yyError);
                          if (yyResult.hasValue()) {

                            yyValue = null;

                            return yyResult.createValue(yyValue, yyError);
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        break;

      case 's':
        {
          yyC = character(yyIndex);
          if (-1 != yyC) {
            yyIndex = yyIndex + 1;
            if ('t' == yyC) {

              yyC = character(yyIndex);
              if (-1 != yyC) {
                yyIndex = yyIndex + 1;
                if ('r' == yyC) {

                  yyC = character(yyIndex);
                  if (-1 != yyC) {
                    yyIndex = yyIndex + 1;
                    if ('i' == yyC) {

                      yyC = character(yyIndex);
                      if (-1 != yyC) {
                        yyIndex = yyIndex + 1;
                        if ('n' == yyC) {

                          yyC = character(yyIndex);
                          if (-1 != yyC) {
                            yyIndex = yyIndex + 1;
                            if ('g' == yyC) {

                              yyResult = pW(yyIndex);
                              yyError  = yyResult.select(yyError);
                              if (yyResult.hasValue()) {

                                yyResult = pstring(yyResult.index);
                                yyError  = yyResult.select(yyError);
                                if (yyResult.hasValue()) {

                                  yyResult = pW(yyResult.index);
                                  yyError  = yyResult.select(yyError);
                                  if (yyResult.hasValue()) {

                                    yyValue = null;

                                    return yyResult.createValue(yyValue, yyError);
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        break;

      default:
        /* No match. */
      }
    }

    // Done.
    yyError = yyError.select("tipos expected", yyStart);
    return yyError;
  }

  // =========================================================================

  /**
   * Parse nonterminal func.deci.
   *
   * @param yyStart The index.
   * @return The result.
   * @throws IOException Signals an I/O error.
   */
  public Result pdeci(final int yyStart) throws IOException {
    funcColumn yyColumn = (funcColumn)column(yyStart);
    if (null == yyColumn.fdeci) yyColumn.fdeci = pdeci$1(yyStart);
    return yyColumn.fdeci;
  }

  /** Actually parse func.deci. */
  private Result pdeci$1(final int yyStart) throws IOException {
    int        yyC;
    int        yyIndex;
    Result     yyResult;
    int        yyBase;
    Void       yyValue;
    ParseError yyError = ParseError.DUMMY;

    // Alternative 1.

    yyResult = pnome(yyStart);
    yyError  = yyResult.select(yyError);
    if (yyResult.hasValue()) {

      yyResult = p$$Shared1(yyResult.index);
      yyError  = yyResult.select(yyError);
      if (yyResult.hasValue()) {

        yyBase = yyResult.index;
        yyC    = character(yyBase);
        if ('=' == yyC) {
          yyIndex = yyResult.index + 1;

          yyResult = p$$Shared1(yyIndex);
          yyError  = yyResult.select(yyError);
          if (yyResult.hasValue()) {

            yyResult = p$$Shared2(yyResult.index);
            yyError  = yyResult.select(yyError);
            if (yyResult.hasValue()) {

              yyBase = yyResult.index;
              yyC    = character(yyBase);
              if ('.' == yyC) {
                yyIndex = yyResult.index + 1;

                yyResult = p$$Shared2(yyIndex);
                yyError  = yyResult.select(yyError);
                if (yyResult.hasValue()) {

                  yyResult = p$$Shared1(yyResult.index);
                  yyError  = yyResult.select(yyError);
                  if (yyResult.hasValue()) {

                    yyBase = yyResult.index;
                    yyC    = character(yyBase);
                    if (';' == yyC) {
                      yyIndex = yyResult.index + 1;

                      yyValue = null;

                      return new SemanticValue(yyValue, yyIndex, yyError);
                    } else {
                      yyError = yyError.select("';' expected", yyBase);
                    }
                  }
                }
              } else {
                yyError = yyError.select("'.' expected", yyBase);
              }
            }
          }
        } else {
          yyError = yyError.select("'=' expected", yyBase);
        }
      }
    }

    // Done.
    return yyError;
  }

  // =========================================================================

  /**
   * Parse synthetic nonterminal func.$$Shared1.
   * This nonterminal represents the duplicate productions func.deci$$Star1, 
   * func.deci$$Star2, and func.deci$$Star3.
   *
   * @param yyStart The index.
   * @return The result.
   * @throws IOException Signals an I/O error.
   */
  private Result p$$Shared1(final int yyStart) throws IOException {
    funcColumn yyColumn = (funcColumn)column(yyStart);
    if (null == yyColumn.f$$Shared1) 
      yyColumn.f$$Shared1 = p$$Shared1$1(yyStart);
    return yyColumn.f$$Shared1;
  }

  /** Actually parse func.$$Shared1. */
  private Result p$$Shared1$1(final int yyStart) throws IOException {
    Result     yyResult;
    Void       yyValue;
    ParseError yyError = ParseError.DUMMY;

    // Alternative 1.

    yyResult = pW(yyStart);
    yyError  = yyResult.select(yyError);
    if (yyResult.hasValue()) {

      yyResult = p$$Shared1(yyResult.index);
      yyError  = yyResult.select(yyError);
      if (yyResult.hasValue()) {

        yyValue = null;

        return yyResult.createValue(yyValue, yyError);
      }
    }

    // Alternative 2.

    yyValue = null;

    return new SemanticValue(yyValue, yyStart, yyError);
  }

  // =========================================================================

  /**
   * Parse synthetic nonterminal func.$$Shared2.
   * This nonterminal represents the duplicate productions func.deci$$Plus1 
   * and func.deci$$Plus2.
   *
   * @param yyStart The index.
   * @return The result.
   * @throws IOException Signals an I/O error.
   */
  private Result p$$Shared2(final int yyStart) throws IOException {
    funcColumn yyColumn = (funcColumn)column(yyStart);
    if (null == yyColumn.f$$Shared2) 
      yyColumn.f$$Shared2 = p$$Shared2$1(yyStart);
    return yyColumn.f$$Shared2;
  }

  /** Actually parse func.$$Shared2. */
  private Result p$$Shared2$1(final int yyStart) throws IOException {
    int        yyC;
    int        yyIndex;
    Result     yyResult;
    Void       yyValue;
    ParseError yyError = ParseError.DUMMY;

    // Alternative 1.

    yyC = character(yyStart);
    if (-1 != yyC) {
      yyIndex = yyStart + 1;

      switch (yyC) {
      case '0':
      case '1':
      case '2':
      case '3':
      case '4':
      case '5':
      case '6':
      case '7':
      case '8':
      case '9':
        {
          final int yyChoice1 = yyIndex;

          // Nested alternative 1.

          yyResult = p$$Shared2(yyChoice1);
          yyError  = yyResult.select(yyError);
          if (yyResult.hasValue()) {

            yyValue = null;

            return yyResult.createValue(yyValue, yyError);
          }

          // Nested alternative 2.

          yyValue = null;

          return new SemanticValue(yyValue, yyChoice1, yyError);
        }

      default:
        /* No match. */
      }
    }

    // Done.
    yyError = yyError.select(" expected", yyStart);
    return yyError;
  }

  // =========================================================================

  /**
   * Parse nonterminal func.int.
   *
   * @param yyStart The index.
   * @return The result.
   * @throws IOException Signals an I/O error.
   */
  public Result pint(final int yyStart) throws IOException {
    int        yyC;
    int        yyIndex;
    Result     yyResult;
    int        yyBase;
    int        yyRepetition1;
    boolean    yyRepeated1;
    Void       yyValue;
    ParseError yyError = ParseError.DUMMY;

    // Alternative 1.

    yyResult = pnome(yyStart);
    yyError  = yyResult.select(yyError);
    if (yyResult.hasValue()) {

      yyRepetition1 = yyResult.index;
      while (true) {

        yyResult = pW(yyRepetition1);
        yyError  = yyResult.select(yyError, yyRepetition1);
        if (yyResult.hasValue()) {

          yyRepetition1 = yyResult.index;
          continue;
        }
        break;
      }

      yyBase = yyRepetition1;
      yyC    = character(yyBase);
      if ('=' == yyC) {
        yyIndex = yyRepetition1 + 1;

        yyRepetition1 = yyIndex;
        while (true) {

          yyResult = pW(yyRepetition1);
          yyError  = yyResult.select(yyError, yyRepetition1);
          if (yyResult.hasValue()) {

            yyRepetition1 = yyResult.index;
            continue;
          }
          break;
        }

        yyRepeated1   = false;
        while (true) {

          yyC = character(yyRepetition1);
          if (-1 != yyC) {
            yyIndex = yyRepetition1 + 1;

            switch (yyC) {
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
              {
                yyRepetition1 = yyIndex;
                yyRepeated1   = true;
                continue;
              }

            default:
              /* No match. */
            }
          }
          break;
        }

        if (yyRepeated1) {

          while (true) {

            yyResult = pW(yyRepetition1);
            yyError  = yyResult.select(yyError, yyRepetition1);
            if (yyResult.hasValue()) {

              yyRepetition1 = yyResult.index;
              continue;
            }
            break;
          }

          yyBase = yyRepetition1;
          yyC    = character(yyBase);
          if (';' == yyC) {
            yyIndex = yyRepetition1 + 1;

            yyValue = null;

            return new SemanticValue(yyValue, yyIndex, yyError);
          } else {
            yyError = yyError.select("';' expected", yyBase);
          }
        }
      } else {
        yyError = yyError.select("'=' expected", yyBase);
      }
    }

    // Done.
    yyError = yyError.select("int expected", yyStart);
    return yyError;
  }

  // =========================================================================

  /**
   * Parse nonterminal func.char.
   *
   * @param yyStart The index.
   * @return The result.
   * @throws IOException Signals an I/O error.
   */
  public Result pchar(final int yyStart) throws IOException {
    int        yyC;
    int        yyIndex;
    Result     yyResult;
    int        yyBase;
    int        yyRepetition1;
    Void       yyValue;
    ParseError yyError = ParseError.DUMMY;

    // Alternative 1.

    yyResult = pnome(yyStart);
    yyError  = yyResult.select(yyError);
    if (yyResult.hasValue()) {

      yyRepetition1 = yyResult.index;
      while (true) {

        yyResult = pW(yyRepetition1);
        yyError  = yyResult.select(yyError, yyRepetition1);
        if (yyResult.hasValue()) {

          yyRepetition1 = yyResult.index;
          continue;
        }
        break;
      }

      yyBase = yyRepetition1;
      yyC    = character(yyBase);
      if ('=' == yyC) {
        yyIndex = yyRepetition1 + 1;

        yyRepetition1 = yyIndex;
        while (true) {

          yyResult = pW(yyRepetition1);
          yyError  = yyResult.select(yyError, yyRepetition1);
          if (yyResult.hasValue()) {

            yyRepetition1 = yyResult.index;
            continue;
          }
          break;
        }

        yyBase = yyRepetition1;
        yyC    = character(yyBase);
        if ('\'' == yyC) {
          yyIndex = yyRepetition1 + 1;

          yyC = character(yyIndex);
          if (-1 != yyC) {
            yyIndex = yyIndex + 1;
            if ((('A' <= yyC) && (yyC <= 'Z')) ||
                (('a' <= yyC) && (yyC <= 'z'))) {

              yyBase = yyIndex;
              yyC    = character(yyBase);
              if ('\'' == yyC) {
                yyIndex = yyIndex + 1;

                yyRepetition1 = yyIndex;
                while (true) {

                  yyResult = pW(yyRepetition1);
                  yyError  = yyResult.select(yyError, yyRepetition1);
                  if (yyResult.hasValue()) {

                    yyRepetition1 = yyResult.index;
                    continue;
                  }
                  break;
                }

                yyBase = yyRepetition1;
                yyC    = character(yyBase);
                if (';' == yyC) {
                  yyIndex = yyRepetition1 + 1;

                  yyValue = null;

                  return new SemanticValue(yyValue, yyIndex, yyError);
                } else {
                  yyError = yyError.select("';' expected", yyBase);
                }
              } else {
                yyError = yyError.select("'\\\'' expected", yyBase);
              }
            }
          }
        } else {
          yyError = yyError.select("'\\\'' expected", yyBase);
        }
      } else {
        yyError = yyError.select("'=' expected", yyBase);
      }
    }

    // Done.
    yyError = yyError.select("char expected", yyStart);
    return yyError;
  }

  // =========================================================================

  /**
   * Parse nonterminal func.string.
   *
   * @param yyStart The index.
   * @return The result.
   * @throws IOException Signals an I/O error.
   */
  public Result pstring(final int yyStart) throws IOException {
    int        yyC;
    int        yyIndex;
    Result     yyResult;
    int        yyBase;
    int        yyRepetition1;
    boolean    yyRepeated1;
    Void       yyValue;
    ParseError yyError = ParseError.DUMMY;

    // Alternative 1.

    yyResult = pnome(yyStart);
    yyError  = yyResult.select(yyError);
    if (yyResult.hasValue()) {

      yyRepetition1 = yyResult.index;
      while (true) {

        yyResult = pW(yyRepetition1);
        yyError  = yyResult.select(yyError, yyRepetition1);
        if (yyResult.hasValue()) {

          yyRepetition1 = yyResult.index;
          continue;
        }
        break;
      }

      yyBase = yyRepetition1;
      yyC    = character(yyBase);
      if ('=' == yyC) {
        yyIndex = yyRepetition1 + 1;

        yyRepetition1 = yyIndex;
        while (true) {

          yyResult = pW(yyRepetition1);
          yyError  = yyResult.select(yyError, yyRepetition1);
          if (yyResult.hasValue()) {

            yyRepetition1 = yyResult.index;
            continue;
          }
          break;
        }

        yyC = character(yyRepetition1);
        if ('\"' == yyC) {
          yyIndex = yyRepetition1 + 1;

          yyRepetition1 = yyIndex;
          yyRepeated1   = false;
          while (true) {

            yyC = character(yyRepetition1);
            if (-1 != yyC) {
              yyIndex = yyRepetition1 + 1;
              if ((('0' <= yyC) && (yyC <= '9')) ||
                  (('A' <= yyC) && (yyC <= 'Z')) ||
                  (('a' <= yyC) && (yyC <= 'z'))) {

                yyRepetition1 = yyIndex;
                yyRepeated1   = true;
                continue;
              }
            }
            break;
          }

          if (yyRepeated1) {

            yyC = character(yyRepetition1);
            if ('\"' == yyC) {
              yyIndex = yyRepetition1 + 1;

              yyRepetition1 = yyIndex;
              while (true) {

                yyResult = pW(yyRepetition1);
                yyError  = yyResult.select(yyError, yyRepetition1);
                if (yyResult.hasValue()) {

                  yyRepetition1 = yyResult.index;
                  continue;
                }
                break;
              }

              yyBase = yyRepetition1;
              yyC    = character(yyBase);
              if (';' == yyC) {
                yyIndex = yyRepetition1 + 1;

                yyValue = null;

                return new SemanticValue(yyValue, yyIndex, yyError);
              } else {
                yyError = yyError.select("';' expected", yyBase);
              }
            }
          }
        }
      } else {
        yyError = yyError.select("'=' expected", yyBase);
      }
    }

    // Done.
    yyError = yyError.select("string expected", yyStart);
    return yyError;
  }

}
