using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Threading;

namespace SpaceInvaders
{
    class Timer{
        private Player man = null;
        private DispatcherTimer timer = new DispatcherTimer();

        public Timer()
        {
            timer.Tick += TimerTick;
            timer.Interval=new TimeSpan(10000);
            timer.Start();
        }

        private void TimerTick(object sender, EventArgs e)
        {
            /*switch (man.direction)
            {
                case (int)Player.Direction.Up:
                    man.shoot();
                    break;
                case (int)Player.Direction.Left:
                    man.currentPosition.X -= 1;          
                    break;
                case (int)Player.Direction.Right:
                    man.currentPosition.X += 1;
                    break;
                case 0:
                    break;
            }*/
        }
    }
}
