using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Reflection;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace SpaceInvaders
{
    /// <summary>
    /// Interaktionslogik für MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        readonly KeyHandler Keys = new KeyHandler();
        public MainWindow()
        {
            InitializeComponent();
            new Timer();
            this.KeyDown += Keys.OnKeyDown;
        }

        private void NewGameButton(object sender, RoutedEventArgs e)
        {
            Process.Start(Application.ResourceAssembly.Location);
            Application.Current.Shutdown();
        }

        private void PauseButton(object sender, RoutedEventArgs e)
        {
            
        }

        private void AboutButton(object sender, RoutedEventArgs e)
        {
           
        }

        private void ExitButton(object sender, RoutedEventArgs e)
        {
            Environment.Exit(0);
        }
    }
}
