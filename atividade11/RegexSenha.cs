using System;
using System.Text.RegularExpressions;

class RegexSenha
{
    static void Main()
    {
        string[] senhasParaTestar = {
            "Abc12#def",     // Válido
            "abc12#def",     // Inválido (falta letra maiúscula)
            "ABC12#DEF",     // Inválido (falta letra minúscula)
            "Abcdefghi",     // Inválido (falta número e caractere especial)
            "12345!Abc",     // Válido
            "A1!bcdefg",     // Válido
            "A1!bcdefghijk", // Inválido (comprimento maior que 12)
            "A1!bcd"         // Inválido (comprimento menor que 8)
        };

        foreach (string senha in senhasParaTestar)
        {
            Console.WriteLine($"{senha}: {ValidarSenha(senha)}");
        }
    }

    static bool ValidarSenha(string senha)
    {
        string padrao = @"^(?=.*[A-Z])(?=.*\d)(?=.*[\W_])(?=.*[a-zA-Z]).{8,12}$";
        return Regex.IsMatch(senha, padrao);
    }
}
