using System;
using System.Text.RegularExpressions;

class RegexLogin
{
    static void Main()
    {
        string[] loginsParaTestar = {
            "abc12#",       // Válido
            "abcdefg",      // Inválido (falta número e caractere especial)
            "12345!",       // Inválido (falta letra)
            "a1!a1",        // Válido
            "a1!a1a1!a1!a1!a1!a1!a1!a1!a1!a1!a1!a1!",  // Inválido (comprimento maior que 30)
            "a1!@#"         // Válido
        };

        foreach (string login in loginsParaTestar)
        {
            Console.WriteLine($"{login}: {ValidarLogin(login)}");
        }
    }

    static bool ValidarLogin(string login)
    {
        string padrao = @"^(?=.*[a-zA-Z])(?=.*\d)(?=.*[\W_]).{5,30}$";
        return Regex.IsMatch(login, padrao);
    }
}
